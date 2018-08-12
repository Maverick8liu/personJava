package patterns.chain;
/**
 * ��һ�����崦����
 * @author liuguoyu
 *
 */
//��һ�����崦���ߣ�����С��0��
public class Handler1 implements Handler{
	private Handler next;
	@Override
	public int handlerRequest(int n) {
		// TODO Auto-generated method stub
		if(n<0)return -n;
		else{
			if(next  == null)
				throw new NullPointerException("next ����Ϊ��");
			return next.handlerRequest(n);
		}
	}

	@Override
	public void setNextHandler(Handler next) {
		// TODO Auto-generated method stub
		this.next = next;
	}
	
}
