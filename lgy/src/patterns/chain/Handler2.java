package patterns.chain;

//�ڶ������崦���ߣ�����>=0��С��10��
public class Handler2 implements Handler{
	private Handler next;
	@Override
	public int handlerRequest(int n) {
		// TODO Auto-generated method stub
		if(n < 10)return n*n;
		else{
			if(next == null)
				throw new NullPointerException("next ��/��Ϊ��/");
			return next.handlerRequest(n);
		}
	}

	@Override
	public void setNextHandler(Handler next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

}
