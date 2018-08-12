package patterns.visitor;

public class UserVIP implements User {
	String estimation;
	
	public UserVIP(String estimation) {
		// TODO Auto-generated constructor stub
		this.estimation = estimation;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public String getEstimation() {
		return estimation;
	}

}
