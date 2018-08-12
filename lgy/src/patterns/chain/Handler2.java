package patterns.chain;

//第二个具体处理者，处理>=0但小于10的
public class Handler2 implements Handler{
	private Handler next;
	@Override
	public int handlerRequest(int n) {
		// TODO Auto-generated method stub
		if(n < 10)return n*n;
		else{
			if(next == null)
				throw new NullPointerException("next 不/能为空/");
			return next.handlerRequest(n);
		}
	}

	@Override
	public void setNextHandler(Handler next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

}
