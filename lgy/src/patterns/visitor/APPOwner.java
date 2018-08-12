package patterns.visitor;

public class APPOwner implements Visitor {

	@Override
	public void visit(UserVIP user) {
		// TODO Auto-generated method stub
		String estimation = user.getEstimation();
		if(estimation.length() > 5)
			System.out.println("记录一条vip有效返回:"+estimation);
	}

	@Override
	public void visit(UserOrdinary user) {
		// TODO Auto-generated method stub
		String estimation = user.getEstimation();
		if(estimation.length() > 10)
			System.out.println("记录一条有效返回:"+estimation);
	}

}
