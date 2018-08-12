package patterns.proxy;

public class ProxyObject implements AbstractObject {

	AbstractObject object = new TargetObject();

	@Override
	public void method1() {
		object.method1();
	}

	@Override
	public int method2() {
		return object.method2();
	}

	@Override
	public void method3() {
		System.out.println("����Ŀ�����ǰ�Ĳ���");
		object.method3();
		System.out.println("����Ŀ������Ĳ���");
	}
}
