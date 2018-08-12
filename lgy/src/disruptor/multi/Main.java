package disruptor.multi;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.ExceptionHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.SequenceBarrier;
import com.lmax.disruptor.WorkerPool;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.ProducerType;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//创建ringBuffer
		RingBuffer<Order> ringBuffer = RingBuffer.create(ProducerType.MULTI, 
							new EventFactory<Order>(){

								@Override
								public Order newInstance() {
									// TODO Auto-generated method stub
									return new Order();
								}
							}, 1024*1024, new YieldingWaitStrategy());
		
		SequenceBarrier barriers = ringBuffer.newBarrier();
		
		
		Consumer[] cousumers = new Consumer[3];
		for(int i = 0;i<cousumers.length;i++){
			cousumers[i] = new Consumer("c"+i);
		}
		
		WorkerPool<Order> workerPool = 
				new WorkerPool<Order>(ringBuffer, barriers, new IntEventExceptionHandler(),cousumers);
		
		
		ringBuffer.addGatingSequences(workerPool.getWorkerSequences());
		workerPool.start(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()));
		
		
		final CountDownLatch latch = new CountDownLatch(1);
		for(int i = 0;i < 100;i++){
			final Producer p = new Producer(ringBuffer);
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						latch.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					for(int j = 0;j < 100;j++){
						p.onData(UUID.randomUUID().toString());
					}
				}
			}).start();
			
			Thread.sleep(2000);
			System.out.println("---------------------开始生产-------------");
			latch.countDown();
			Thread.sleep(5000);
			System.out.println("总数:"+(cousumers[0].getCount()));
			
		}
		
	}
	
	static class IntEventExceptionHandler implements ExceptionHandler{

		@Override
		public void handleEventException(Throwable arg0, long arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handleOnShutdownException(Throwable arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handleOnStartException(Throwable arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
