package disruptor.generate2;

import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;

import disruptor.generate1.Trade;

public class Handler4 implements EventHandler<Trade>,WorkHandler<Trade>{

	@Override
	public void onEvent(Trade event, long sequence, boolean endOfBatch) throws Exception {
		// TODO Auto-generated method stub
		this.onEvent(event);
	}

	@Override
	public void onEvent(Trade event) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("handler4:get name:"+event.getName());
		event.setName(event.getName()+"h4");
	}

}
