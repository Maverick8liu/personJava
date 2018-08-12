package patterns.visitor;

public class MultiDispatch {
	public static void main(String[] args) {
		Child child = new Child();
		child.print();
		child.print(new Vistor());
	}
}

class Father{
	void print(){
		System.out.println("fahter class");
	}
}

class Child extends Father{
	void print(){
		System.out.println("child class");
	}
	
	void print(Vistor c){
		c.print(this);
	}
}

class Vistor{
	public void print(Child child){
		child.print();
	}
}
