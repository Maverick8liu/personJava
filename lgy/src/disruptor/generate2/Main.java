package disruptor.generate2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.HandshakeCompletedListener;
import javax.xml.ws.handler.HandlerResolver;

import com.lmax.disruptor.BusySpinWaitStrategy;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.EventHandlerGroup;
import com.lmax.disruptor.dsl.ProducerType;

import disruptor.generate1.Trade;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		long beginTime = System.currentTimeMillis();
		int bufferSize = 1024;
		ExecutorService executor = Executors.newFixedThreadPool(8);
		
		Disruptor<Trade> disruptor = new Disruptor<Trade>(new EventFactory<Trade>() {
			@Override
			public Trade newInstance() {
				// TODO Auto-generated method stub
				return new Trade();
			}
		},bufferSize,executor,ProducerType.SINGLE,new BusySpinWaitStrategy());
		//���β���
		/*//ʹ��disruptor������������C1,C2  
		EventHandlerGroup<Trade> handlerGroup = 
				disruptor.handleEventsWith(new Handler1(),new Handler2());
		*//**
		 * ��������Ϊ
		 * 			c1
		 * p1   			c3
		 * 			c2
		 *//*
		//������C1��C2����֮��ִ��JMS��Ϣ���Ͳ��� Ҳ���������ߵ�C3
		handlerGroup.then(new Handler3());*/
		
		/*//˳�����
		disruptor.handleEventsWith(new Handler1()).
					handleEventsWith(new Handler2()).
					handleEventsWith(new Handler3());*/
		
		//�����β���
		Handler1 h1 = new Handler1();
		Handler2 h2 = new Handler2();
		Handler3 h3 = new Handler3();
		Handler4 h4 = new Handler4();
		Handler5 h5 = new Handler5();
		disruptor.handleEventsWith(h1,h2);
		disruptor.after(h1).handleEventsWith(h4);
		disruptor.after(h2).handleEventsWith(h5);
		disruptor.after(h4,h5).handleEventsWith(h3);
		
		
		disruptor.start();//����
		CountDownLatch latch = new CountDownLatch(1);
		//������׼��
		executor.submit(new TradePublisher(latch, disruptor));
		latch.await();//�ȴ�����������
		
		disruptor.shutdown();
		executor.shutdown();
		System.out.println("all times :"+(System.currentTimeMillis() - beginTime));
		
		
	}
	
	
	
	
		
}
