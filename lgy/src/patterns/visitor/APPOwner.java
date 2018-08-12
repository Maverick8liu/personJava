package patterns.visitor;

public class APPOwner implements Visitor {

	@Override
	public void visit(UserVIP user) {
		// TODO Auto-generated method stub
		String estimation = user.getEstimation();
		if(estimation.length() > 5)
			System.out.println("��¼һ��vip��Ч����:"+estimation);
	}

	@Override
	public void visit(UserOrdinary user) {
		// TODO Auto-generated method stub
		String estimation = user.getEstimation();
		if(estimation.length() > 10)
			System.out.println("��¼һ����Ч����:"+estimation);
	}

}
