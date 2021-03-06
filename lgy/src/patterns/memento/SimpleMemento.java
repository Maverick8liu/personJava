package patterns.memento;

/**
 * 备忘录模式
 * @author Administrator
 *在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存该状态，这样就可以将该对象恢复到之前保存的状态。

    何时使用：

    必须保存一个对象在某一时刻的全部或部分状态，以便在需要时恢复该对象先前的状态。
    一个对象不想通过提供public权限的，诸如getXXX()的方法让其他对象得到自己IDE内部状态。
    优点：

    备忘录模式使用备忘录可以吧原先者的内部状态全部保存起来，使是有很“亲密”的对象可以访问备忘录中的数据。
    备忘录模式强调了类设计单一责任的原则，即将状态的刻画和保存分开。
    备忘录模式又叫做快照模式(Snapshot Pattern)或Token模式，是对象的行为模式。 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。

    备忘录模式中有三种角色：

    备忘录(Memento)角色：将发起人（Originator）对象的内战状态存储起来。备忘录可以根据发起人对象的判断来决定存储多少发起人（Originator）对象的内部状态。备忘录可以保护其内容不被发起人（Originator）对象之外的任何对象所读取。
    发起人（Originator）角色：创建一个含有当前的内部状态的备忘录对象。使用备忘录对象存储其内部状态。
    负责人（Caretaker）角色：负责保存备忘录对象。不检查备忘录对象的内容。
 */
public class SimpleMemento {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*Originator originator = new Originator(); //发起人，要被保存的对象,也是他创建要保存的信息的
		Caretaker caretaker = new Caretaker(); //辅助保存的对象
		originator.setState("stateOne"); //设置状态
		caretaker.saveMemento(originator.createMemento()); //保存状态
		originator.setState("stateTwo"); //修改状态
		originator.recoverMemento(caretaker.recoverMemento()); //恢复状态
*/		
		Orginator originator = new Orginator();
		Caretaker caretaker = new Caretaker();
		originator.setState("stateOne");
		caretaker.saveMemento(originator.createMemento());
		originator.setState("stateTwo");
		originator.recoverMemento(caretaker.recoverMemento());
	}

}

class Orginator{
	private String state;
	
	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void recoverMemento(Memento memento){
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

//备忘录
class Memento{
	private String state;
	public Memento(String state){
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
//负责人
class Caretaker{
	private Memento memento;
	
	public Memento recoverMemento() throws Exception{
		if(memento == null)
			throw new Exception("没有保存状态！");
		return this.memento;
	}
	
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	
}