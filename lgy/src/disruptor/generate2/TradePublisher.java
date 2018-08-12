package disruptor.generate2;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.dsl.Disruptor;

import disruptor.generate1.Trade;

public class TradePublisher implements Runnable{

	Disruptor<Trade> disruptor;
	private CountDownLatch latch;
	
	private static int LOOP = 10;//模拟百万次交易的发生  
	
	public TradePublisher(CountDownLatch latch,Disruptor<Trade> disruptor) {
		// TODO Auto-generated constructor stub
		this.latch = latch;
		this.disruptor = disruptor;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		TradeEventTranslator tradeTransloator = new TradeEventTranslator();
		for(int i = 0;i<LOOP;i++){
			disruptor.publishEvent(tradeTransloator);
		}
		latch.countDown();
	}

}

class TradeEventTranslator implements EventTranslator<Trade>{

	private Random random = new Random();
	
	@Override
	public void translateTo(Trade event, long sequence) {
		// TODO Auto-generated method stub
		this.generateTrade(event);
	}

	private Trade generateTrade(Trade event) {
		// TODO Auto-generated method stub
		event.setPrice(random.nextDouble()*9999);
		return event;
	}
	
	
	
}
