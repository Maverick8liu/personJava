package patterns.prototype;

public class APITestUse {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MyObject myOvbject = new MyObject();
		myOvbject.i = 500;
		MyObject myOvbjectClone = (MyObject) myOvbject.clone();
		System.out.println(myOvbjectClone.i);
	}

}

class MyObject implements Cloneable{
	int i;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
