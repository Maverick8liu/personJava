package patterns.state;
/**
 * 状态模式
 * @author Administrator
 *允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。

    何时使用：

    一个对象的行为依赖于它的状态，并且它必须在运行时根据状态改变它的行为 。
    需要编写大量的条件分支语句来决定一个操作的行为，而且这些条件恰好表示对象的一种状态。
    优点：

    使用一个类封装对象的一种状态，很容易增加新的状态
    在状态模式中，环境（Context）中不必出现大量的条件判断语句。环境（Context）实例所呈现的状态变得更加清晰、容易理解。
    使用状态模式可以让用户程序很方便地切换环境（Context）实例的状态。
    使用状态模式不会让环境（Context）中的实例中出现内部状态不一致的情况。
    当状态对象没有实例变量时，环境（Context）的各个实例可以共享一个状态对象。
    用一句话来表述，状态模式把所研究的对象的行为包装在不同的状态对象里，每一个状态对象都属于一个抽象状态类的一个子类。状态模式的意图是让一个对象在其内部状态改变的时候，其行为也随之改变。

    可能这段时间老是在想数据库相关的事儿，所以一想例子就就想到这方面来了...不过，这样大家也能更好的对比设计模式之间的差异，下本例还是与这方面相关的。

    设想我们有一个程序，要保存数据的，按照数据（这里以String举例）的大小，使用不同的方式保存。如果数据很小，我们将其保存到Redis（缓存数据库）中，如果数据库不太小也不太大，我们将其保存到mysql中，如果数据非常大，我们直接将其写入到文件中。数据的大小就是一种状态，很适合使用状态模式：
 */
//环境（Context）
public class SaveDataController {
	private ISaveData saveData;
	
	public void save(String data){
		if(data.length() < 1 <<2)
			saveData = SaveSmallData.instance;
		else if(data.length() <1 <<4)
			saveData = SaveMiddleData.instance;
		else
			saveData = SaveBigData.instance;
		saveData.save(data);
	}
	
}
