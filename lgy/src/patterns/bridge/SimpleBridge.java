package patterns.bridge;
/**
 * 
 * @author Administrator
 * 将抽象部分与它的实现部分分离，使它们都可以独立的变化。

    何时使用：

    不想让抽象和某些重要的实现代码是固定的绑定关系，这部分实现可运行时动态决定。
    抽象和实现者都可以继承当方式独立地扩充而互不影响，程序在运行期间可能需要动态的将一个抽象的子类的实例与一个实现者的子类的实例进行组合。
    希望对实现者层次代码的修改对抽象层不产生影响，即抽象层的代码不需要重新编译，反之亦然。
    优点:

    桥接模式分离实现与抽象，使抽象可实现可以独立的扩展。当修改实现的代码时，不影响抽象的代码，反之也一样。
    满足开闭-原则，抽象和实现者处于同层次，使系统可独立的扩展这两个层次。增加新的具体实现者，不需要修改细化抽象，反之增加新的细化抽象也不需要修改具体实现。
    桥接模式是一种结构型模式，它主要应对的是：由于实际的需要，某个类具有两个或两个以上的维度变化，如果只是用继承将无法实现这种需要，或者使得设计变得相当臃肿。

    桥接模式的做法是把变化部分抽象出来，使变化部分与主类分离开来，从而将多个维度的变化彻底分离。最后，提供一个管理类来组合不同维度上的变化，通过这种组合来满足业务的需要。

    桥接模式中有4种角色：

    抽象
    细化抽象
    实现者
    具体实现者
    下面看一个例子（并不是黑联想和AMD，仅仅是一个例子而已...）：
 */
//桥接模式
public class SimpleBridge {
	public static void main(String args[]) {
		new LenevoComputer(new Amd()).discribe();
		new HaseeComputer(new Intel()).discribe();
	}
}

// 实现者
interface Cpu {
	String discribe();
}

// 具体实现者*2
class Amd implements Cpu {
	public String discribe() {
		return "just so so...";
	}
}

class Intel implements Cpu {
	public String discribe() {
		return "great !";
	}
}

// 抽象
abstract class AbstractComputer {
	Cpu cpu;

	public AbstractComputer(Cpu cpu) {
		this.cpu = cpu;
	}

	public abstract void discribe();
}

// 细化抽象*2
class LenevoComputer extends AbstractComputer {
	public LenevoComputer(Cpu cpu) {
		super(cpu);
	}

	@Override
	public void discribe() {
		System.out.println("联想笔记本cpu:" + super.cpu.discribe());
	}
}

class HaseeComputer extends AbstractComputer {
	public HaseeComputer(Cpu cpu) {
		super(cpu);
	}

	@Override
	public void discribe() {
		System.out.println("神舟笔记本cpu:" + super.cpu.discribe());
	}
}// 输出：联想笔记本cpu:just so so... 神舟笔记本cpu:great !
