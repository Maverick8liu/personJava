package disruptor.generate1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.lmax.disruptor.BatchEventProcessor;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.SequenceBarrier;
import com.lmax.disruptor.YieldingWaitStrategy;

public class Main1 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int BUFFER_SIZE = 1024;
		int THREAD_NUMBERS = 4;
		/* 
         * createSingleProducer����һ���������ߵ�RingBuffer�� 
         * ��һ��������EventFactory����������������"�¼�����"����ʵ����ְ����ǲ����������RingBuffer�����顣 
         * �ڶ���������RingBuffer�Ĵ�С����������2��ָ���� Ŀ����Ϊ�˽���ģ����תΪ&�������Ч�� 
         * ������������RingBuffer����������û�п��������ʱ��(�����������ߣ�����˵���¼��������� ̫����)�ĵȴ����� 
         */ 
		final RingBuffer<Trade> ringBuffer = RingBuffer.createSingleProducer(new EventFactory<Trade>() {

			@Override
			public Trade newInstance() {
				// TODO Auto-generated method stub
				return new Trade();
			}
		}, BUFFER_SIZE,new YieldingWaitStrategy());
		
		//�����̳߳�
		ExecutorService executors = Executors.newFixedThreadPool(THREAD_NUMBERS);
		
		//����SequenceBarrier
		SequenceBarrier sequenceBarrier = ringBuffer.newBarrier();
		
		//������Ϣ������
		BatchEventProcessor<Trade> transProcessor = new BatchEventProcessor<Trade>(
				ringBuffer, sequenceBarrier, new TradeHandler());
		//��һ����Ŀ�ľ��ǰ������ߵ�λ����Ϣ����ע�뵽������    ���ֻ��һ�������ߵ��������ʡ�� 
		ringBuffer.addGatingSequences(transProcessor.getSequence());
		//����Ϣ�������ύ���̳߳�
		executors.submit(transProcessor);
		
		 //������ڶ�������� ���ظ�ִ������3�д��� ��TradeHandler����������������  
		Future<?> future = executors.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				// TODO Auto-generated method stub
				long seq;
				for(int i = 0;i<10;i++){
					seq = ringBuffer.next();//ռ���� --ringBuffer-һ����������
					ringBuffer.get(seq).setPrice(Math.random()*9999);//������������ ���� 
					ringBuffer.publish(seq);
				}
				return null;
			}
		});
		
		future.get();//�ȴ������߽���
		Thread.sleep(1000);//����1�룬�����Ѷ��������  
		transProcessor.halt();//֪ͨ�¼�(����˵��Ϣ)������ ���Խ����ˣ����������Ͻ���!!!��  
		executors.shutdown();//��ֹ�߳�
	}
}
