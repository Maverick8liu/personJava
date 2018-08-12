package patterns;

/**
 *   �ṩһ������һϵ�л��໥��������Ľӿڣ�������ָ�����ǵľ�����ࡣ

    ��ʱʹ�ã�

    �ŵ㣺 

    �������������Ʒ�������У�����ֻ�������ֻ�����������ֹ���ֻ�һ�ֲ�Ʒ�����ܻ��������ģ����������Ϊ�˻��������ɶ�����������Ҫ������������չ��
 * @author liuguoyu
 *
 */
public class AbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory bigfactory = new BigFactory();
		IFactory smallfactory = new SmallFactory();
		
		bigfactory.producePhone().run();
		bigfactory.produceHeadset().play();
		
		smallfactory.producePhone().run();
		smallfactory.produceHeadset().play();
		
	}

}
//�����Ʒ1
interface Headset{
	void play();
}
//�����Ʒ2
interface MeizuPhone{
	void run();
}

class Pro5 implements MeizuPhone{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm pro5 phone!");
	}
	
}

class Mx5 implements MeizuPhone{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm MX5 phone!");
	}
	
}

class EP21 implements Headset{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I'm headset P21!");
	}
}

class EP30 implements Headset{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I'm headset P30!");
	}
}

interface IFactory{
	MeizuPhone producePhone();
	Headset produceHeadset();
}

class BigFactory implements IFactory{

	@Override
	public MeizuPhone producePhone() {
		// TODO Auto-generated method stub
		return new Pro5();
	}

	@Override
	public Headset produceHeadset() {
		// TODO Auto-generated method stub
		return new EP30();
	}

}

class SmallFactory implements IFactory{

	@Override
	public MeizuPhone producePhone() {
		// TODO Auto-generated method stub
		return new Mx5();
	}

	@Override
	public Headset produceHeadset() {
		// TODO Auto-generated method stub
		return new EP21();
	}
}
