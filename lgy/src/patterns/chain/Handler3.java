package patterns.chain;

//���������崦���ߣ�����>=0��С��10��

public class Handler3 implements Handler{
	private Handler next;
	@Override
	public int handlerRequest(int n) {
		// TODO Auto-generated method stub
		if(n <= Integer.MAX_VALUE)return n;
		else{
			if(next == null)
				throw new NullPointerException("mnext ����Ϊ��");
			return next.handlerRequest(n);
		}
	}
	

	@Override
	public void setNextHandler(Handler next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

}
