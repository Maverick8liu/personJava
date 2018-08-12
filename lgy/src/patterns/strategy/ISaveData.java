package patterns.strategy;
/**
 * 
 * @author Administrator
 *定义一系列算法，把他们一个个封装起来，并且使他们可相互替换。本模式使得算法可独立于其他客户端而变化。

    何时使用

    优点

    策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。策略模式通常把一个系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。下面就以一个示意性的实现讲解策略模式实例的结构。

   策略模式中包括三种角色：

    策略（Strategy）：一个接口，定义了若干个算法（抽象方法）。
    具体策略（ConcreteStrategy）：策略的实现。
    上下文/环境（Context）：依赖于策略接口的类。
    策略模式的重心不是如何实现算法，而是如何组织、调用这些算法，从而让程序结构更灵活，具有更好的维护性和扩展性。

    策略模式一个很大的特点就是各个策略算法的平等性。对于一系列具体的策略算法，大家的地位是完全一样的，正因为这个平等性，才能实现算法之间可以相互替换。所有的策略算法在实现上也是相互独立的，相互之间是没有依赖的。所以可以这样描述这一系列策略算法：策略算法是相同行为的不同实现。

    运行期间，策略模式在每一个时刻只能使用一个具体的策略实现对象，虽然可以动态地在不同的策略实现中切换，但是同时只能使用一个。

    经常见到的是，所有的具体策略类都有一些公有的行为。这时候，就应当把这些公有的行为放到共同的抽象策略角色Strategy类里面。当然这时候抽象策略角色必须要用Java抽象类实现，而不能使用接口。 这其实也是典型的将代码向继承等级结构的上方集中的标准做法。

    上次我们使用状态模式将数据按不同状态保存到不同地方，这里，我们使用策略模式来实现通过不同的策略来选择数据的保存方式。

    首先是抽象的数据保持类（策略）：
 */
public interface ISaveData {
	void save(Object data);
}
