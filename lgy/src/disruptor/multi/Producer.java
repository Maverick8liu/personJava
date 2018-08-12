package disruptor.multi;

import com.lmax.disruptor.RingBuffer;

public class Producer {
	
	private final RingBuffer<Order> ringBuffer;
	
	public Producer(RingBuffer<Order> ringBuffer){
		this.ringBuffer = ringBuffer;
	}
	
	/**
	 * onData���������¼���ÿ����һ�ξͷ���һ���¼�
	 * ���Ĳ������ù��¼����ݸ�������
	 */
	public void onData(String data){
		//���԰�ringBuffer����һ���¼����У���ônext���ǵõ�����һ���¼���
		long sequence = ringBuffer.next();
		
		try {
			//�����������ȡ��һ���յ�ʱ��������䣨��ȡ����Ŷ�Ӧ���¼�����
			Order order = ringBuffer.get(sequence);
			//��ȡҪͨ���¼����ݵ�ҵ������
			order.setId(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�����¼�
			//ע�⣬����ringBuffer��publish �������������finally����ȷ������õ����ã�
			//���ĳ�������sequenceδ���ύ��������������ķ�����������������producer
			ringBuffer.publish(sequence);
		}
			
			
	}

}
