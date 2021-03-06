package patterns.template;
/**
 * 模板模式
 * @author Administrator
 * 定义一个操作中算法的骨架，而将一些步骤延迟到子类中。模板方法使子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

    何时使用：

    设计者需要给出一个算法的固定步骤，并将某些步骤的具体实现留给子类来实现。
    需要对代码进行重构，将各个子类公共行为提取出来集中到一个共同的父类中以避免代码重复。
    优点：

    可以通过在抽象摸吧能定义模板方法给出成熟的算法步骤，同时又不限制步骤的细节，具体模板实现算法细节不会改变整个算法的骨架。
    在抽象模板模式中，可以通过钩子方法对某些步骤进行挂钩，具体模板通过钩子可以选择算法骨架中的某些步骤。
    模板方法模式是所有模式中最为常见的几个模式之一，是基于继承的代码复用的基本技术。 模板方法模式需要开发抽象类和具体子类的设计师之间的协作。一个设计师负责给出一个算法的轮廓和骨架，另一些设计师则负责给出这个算法的各个逻辑步骤。代表这些具体逻辑步骤的方法称做基本方法(primitive method)；而将这些基本方法汇总起来的方法叫做模板方法(template method)，这个设计模式的名字就是从此而来。

    例如，我们有这样的操作：首先得到一些数据，然后计算这些数据，最后再输出数据，至于这些操作如何实现（当然，一些方法也可以提前实现），我们没有要求，但是这些操作的先后逻辑我们已经确定好了，子类不能改变：
 */
public abstract class AbstractTemplate {
	Object data;
	//这个就是模板方法
	void dealData(){
		getData();
		calcData();
		printData();
	}
	//下面是普通方法，可能已经实现，也可能需要子类实现
	abstract void getData();
	abstract void calcData();
	void printData(){
		System.out.println(data);
	}
}
