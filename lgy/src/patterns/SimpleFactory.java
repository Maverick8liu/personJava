package patterns;

/**
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * @author liuguoyu
 *
 * 何时使用

    用户需要一个类的子类的实例，但不希望与该类的子类形成耦合
    用户需要一个类的子类的实例，但用户不知道该类有哪些子类可用
    优点

    使用工厂方法可以让用户的代码和某个特定类的子类的代码解耦
    工厂方法使用户不必知道它所使用的对象是怎样被创建的，只需知道该对象有哪些方法即可。
    简单工厂模式

    介绍工厂方法模式前，先介绍一下简单工厂模式，简单工厂模式也是一种工厂方法模式。

    简单工厂模式又称静态工厂方法模式。从命名上就可以看出这个模式一定很简单。它存在的目的很简单：定义一个用于创建对象的接口。
 *
 */
/*public class SimpleFactory {
	public static void main(String[] args) {
		try {
			Factory factory = new Factory();
			factory.produce("PRO5").run();
			factory.produce("PRO6").run();
			factory.produce("MX6").run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

*//**
 * 抽象产品
 * @author liuguoyu
 *
 *//*
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
//工厂类
class Factory{
	MeizuPhone produce(String product) throws Exception{
		if("PRO5".equals(product)){
			return new Pro5();
		}else if("PRO6".equals(product)){
			return new Pro6();
		}
		throw new Exception("No such Class");
	}
}
*/
