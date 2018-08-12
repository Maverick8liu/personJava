package patterns.chain;

//第三个具体处理者，处理>=0但小于10的

public class Handler3 implements Handler{
	private Handler next;
	@Override
	public int handlerRequest(int n) {
		// TODO Auto-generated method stub
		if(n <= Integer.MAX_VALUE)return n;
		else{
			if(next == null)
				throw new NullPointerException("mnext 不能为空");
			return next.handlerRequest(n);
		}
	}
	

	@Override
	public void setNextHandler(Handler next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

}
