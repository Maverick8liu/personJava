package patterns.chain;
/**
 * 第一个具体处理者
 * @author liuguoyu
 *
 */
//第一个具体处理者，处理小于0的
public class Handler1 implements Handler{
	private Handler next;
	@Override
	public int handlerRequest(int n) {
		// TODO Auto-generated method stub
		if(n<0)return -n;
		else{
			if(next  == null)
				throw new NullPointerException("next 不能为空");
			return next.handlerRequest(n);
		}
	}

	@Override
	public void setNextHandler(Handler next) {
		// TODO Auto-generated method stub
		this.next = next;
	}
	
}
