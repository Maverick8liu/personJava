package patterns.facade;

public class TestUse {
	public static void main(String args[]) {
		Object info = ProductSalesman.instance.buySomething("���ӷɴ�", "����", "K1234523");
		System.out.println(info);
	}
}