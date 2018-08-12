package patterns.visitor;

public interface Visitor {
	void visit(UserVIP user);
	void visit(UserOrdinary user);
}
