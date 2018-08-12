package patterns;

/**
 *   提供一个创建一系列或相互依赖对象的接口，而无须指定他们的具体的类。

    何时使用：

    优点： 

    上述生成魅族产品的例子中，我们只生产了手机，但是它不止有手机一种产品，可能还有其他的，比如耳机，为了还可以生成耳机，我们需要对上例进行扩展。
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
//抽象产品1
interface Headset{
	void play();
}
//抽象产品2
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
