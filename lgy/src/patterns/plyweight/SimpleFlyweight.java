package patterns.plyweight;

import java.util.HashMap;
/**
 * 
 * @author Administrator
 * 运用共享技术有效地支持大量细粒度的对象。

    何时使用：

    一个应用程序使用大量的对象，这些对象之间部分属性本质上是相同的，这时应使用享元来封装相同的部分。
    对象的多数状态都可变为外部状态，就可以考虑将这样的对象作为系统中发的享元来使用。
    优点:

    使用享元可以节省内存的开销，特别适合处理大量细粒度对象，这些对象的许多属性值是相同的，而且一旦创建则不允许修改。
    享元模式中的享元可以使用方法的参数接收外部状态中的数据，但外部状态数据不会干扰到享元中的内部数据，这就使享元可以在不同的环境中被共享。
    在JAVA语言中，String类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。String str="string"，其中"str"就是一个字符串常量。

    享元模式包括三种角色：

    享元接口（Plyweight）：定义了对外公开的获取其内部数据和接收外部数据的方法。
    具体享元（Concrete Plyweight）：享元接口的实现。
    享元工厂（Plyweight Factory）：该类的实例负责创建和管理享元对象，用户或其他对象必须请求他以获取一个享元对象。
 */
//简单的享元模式
public class SimpleFlyweight {
	public static void main(String args[]) {
		FlyweightFactory factory = new FlyweightFactory();
		IFlyweight flyweight1, flyweight2, flyweight3, flyweight4;
		flyweight1 = factory.getFlyweight("value1");
		flyweight2 = factory.getFlyweight("value1");
		flyweight3 = factory.getFlyweight("value1");
		flyweight4 = factory.getFlyweight("value2");
		flyweight1.doSomething();
		flyweight2.doSomething();
		flyweight3.doSomething();
		flyweight4.doSomething();
		System.out.println(factory.size());
	}
}

// 享元接口
interface IFlyweight {
	void doSomething();
}

// 具体享元
class Flyweight implements IFlyweight {
	private String value;

	public Flyweight(String value) {
		this.value = value;
	}

	@Override
	public void doSomething() {
		System.out.println(value);
	}
}

// 享元工厂
class FlyweightFactory {
	HashMap<String, IFlyweight> flyweights = new HashMap<String, IFlyweight>();

	IFlyweight getFlyweight(String value) {
		IFlyweight flyweight = flyweights.get(value);
		if (flyweight == null) {
			flyweight = new Flyweight(value);
			flyweights.put(value, flyweight);
		}
		return flyweight;
	}

	public int size() {
		return flyweights.size();
	}
}