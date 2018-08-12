package patterns;

/**
 *  工厂方法模式

    工厂方法模式去掉了简单工厂模式中工厂方法的静态属性，使得它可以被子类继承。这样在简单工厂模式里集中在工厂方法上的压力可以由工厂方法模式里不同的工厂子类来分担。

    针对上面的例子，如果使用工厂方法模式，即将工厂定义为一个接口，然后由具体的工厂来确定需要生成什么样的产品，为了与简单工厂比较，这里还是贴上代码：
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
 * 具体产品
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
//抽象工厂
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





