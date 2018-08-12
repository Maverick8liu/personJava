package patterns.chain;

public class TestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1,h2,h3;
		h1 = new Handler1();
		h2 = new Handler2();
		h3 = new Handler3();
		
		
		h1.setNextHandler(h2);
		h2.setNextHandler(h3);
		System.out.println(h1.handlerRequest(-1));
		System.out.println(h1.handlerRequest(5));
		System.out.println(h1.handlerRequest(9999));
	}

}
