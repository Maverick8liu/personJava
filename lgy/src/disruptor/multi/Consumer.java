package disruptor.multi;

import java.util.concurrent.atomic.AtomicInteger;

import com.lmax.disruptor.WorkHandler;

public class Consumer implements WorkHandler<Order>{
		
	private String cousumerId;
	private static AtomicInteger count = new AtomicInteger(0);
	
	public Consumer(String cousumerId) {
		// TODO Auto-generated constructor stub
		this.cousumerId = cousumerId;
	}
	
	public int getCount(){
		return count.get();
	}
	
	@Override
	public void onEvent(Order event) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("��ǰ�����ߣ�"+this.cousumerId+",������Ϣ��"+event.getId());
		count.incrementAndGet();
	}
	
	
	
}
