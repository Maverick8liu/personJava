package disruptor.generate2;

import com.lmax.disruptor.EventHandler;

import disruptor.generate1.Trade;

public class Handler3 implements EventHandler<Trade>{

	@Override
	public void onEvent(Trade event, long sequence, boolean endOfBatch) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("handler3:name:"+event.getName());
	}

}
