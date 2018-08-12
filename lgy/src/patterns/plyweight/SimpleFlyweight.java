package patterns.plyweight;

import java.util.HashMap;
/**
 * 
 * @author Administrator
 * ���ù�������Ч��֧�ִ���ϸ���ȵĶ���

    ��ʱʹ�ã�

    һ��Ӧ�ó���ʹ�ô����Ķ�����Щ����֮�䲿�����Ա���������ͬ�ģ���ʱӦʹ����Ԫ����װ��ͬ�Ĳ��֡�
    ����Ķ���״̬���ɱ�Ϊ�ⲿ״̬���Ϳ��Կ��ǽ������Ķ�����Ϊϵͳ�з�����Ԫ��ʹ�á�
    �ŵ�:

    ʹ����Ԫ���Խ�ʡ�ڴ�Ŀ������ر��ʺϴ������ϸ���ȶ�����Щ������������ֵ����ͬ�ģ�����һ�������������޸ġ�
    ��Ԫģʽ�е���Ԫ����ʹ�÷����Ĳ��������ⲿ״̬�е����ݣ����ⲿ״̬���ݲ�����ŵ���Ԫ�е��ڲ����ݣ����ʹ��Ԫ�����ڲ�ͬ�Ļ����б�����
    ��JAVA�����У�String���;���ʹ������Ԫģʽ��String������final���ͣ�����һ�������Ͳ��ɸı䡣��JAVA���ַ����������Ǵ��ڳ������еģ�JAVA��ȷ��һ���ַ��������ڳ�������ֻ��һ��������String str="string"������"str"����һ���ַ���������

    ��Ԫģʽ�������ֽ�ɫ��

    ��Ԫ�ӿڣ�Plyweight���������˶��⹫���Ļ�ȡ���ڲ����ݺͽ����ⲿ���ݵķ�����
    ������Ԫ��Concrete Plyweight������Ԫ�ӿڵ�ʵ�֡�
    ��Ԫ������Plyweight Factory���������ʵ�����𴴽��͹�����Ԫ�����û���������������������Ի�ȡһ����Ԫ����
 */
//�򵥵���Ԫģʽ
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

// ��Ԫ�ӿ�
interface IFlyweight {
	void doSomething();
}

// ������Ԫ
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

// ��Ԫ����
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