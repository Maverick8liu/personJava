package patterns.adapter;

/**
 * 适配器模式
 * @author Administrator
 * 将一个类的接口转换成客户希望的另外一个接口。该模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

    何时使用

    一个程序想使用已经存在的类，但是该类所实现的接口和当前程序所使用的接口不一致时。
    优点

    目标与被适配者解耦
    满足开-闭原则
    原理就是保留现有的类所提供的服务，修改其接口，从而达到客户端的期望。

    再者，适配器也分对象适配器和类适配器，先看下面代码再来解释。

    举个例子，你有一个播放器，只能播放MP3格式的音乐，但是现在需要它能播放flac格式的，我们不能直接使用这个播放器，但可以添加一个适配器来解决这个问题：
 */
public class ObjectAdapter implements Target{
	private Adaptee adaptee;
	
	public ObjectAdapter() {
		// TODO Auto-generated constructor stub
		super();
		adaptee = new Adaptee();
	}
	@Override
	public void playFlac(Object src) {
		// TODO Auto-generated method stub
		//可能选哟对src作处理
		adaptee.playMp3(src);
	}
	
}

//被适配者
class Adaptee{
	void playMp3(Object src){
		System.out.println("播放MP3：" + src);
	}
}

//目标，也就是用户所希望使用的
interface Target{
	void playFlac(Object src);
}
