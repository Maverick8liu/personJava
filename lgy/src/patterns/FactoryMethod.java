package patterns;

/**
 *  ��������ģʽ

    ��������ģʽȥ���˼򵥹���ģʽ�й��������ľ�̬���ԣ�ʹ�������Ա�����̳С������ڼ򵥹���ģʽ�Ｏ���ڹ��������ϵ�ѹ�������ɹ�������ģʽ�ﲻͬ�Ĺ����������ֵ���

    �����������ӣ����ʹ�ù�������ģʽ��������������Ϊһ���ӿڣ�Ȼ���ɾ���Ĺ�����ȷ����Ҫ����ʲô���Ĳ�Ʒ��Ϊ����򵥹����Ƚϣ����ﻹ�����ϴ��룺
 * @author liuguoyu
 *
 */
/*public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory bigFactory;
		bigFactory = new SmallFactory();
		bigFactory.produce().run();
		bigFactory = new BigFactory();
		bigFactory.produce().run();
		
	}

}

interface MeizuPhone{
	void run();
}

*//**
 * �����Ʒ
 * @author liuguoyu
 *
 *//*
class Pro5 implements MeizuPhone{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm PRO5");
	}
}

class Pro6 implements MeizuPhone{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm PRO6");
	}
}
class Mx5 implements MeizuPhone{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm MX5");
	}
}
//���󹤳�
interface IFactory{
	MeizuPhone produce();
}

class BigFactory implements IFactory{

	@Override
	public MeizuPhone produce() {
		// TODO Auto-generated method stub
		return new Pro5();
	}
	
}

class SmallFactory implements IFactory{

	@Override
	public MeizuPhone produce() {
		// TODO Auto-generated method stub
		return new Mx5();
	}
}
*/





