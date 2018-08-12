package patterns.visitor;
/**
 * 访问者模式
 * @author Administrator
 *    表示一个作用于某对象结构中的各个元素的操作。它可以在不改变各个元素的类的前提下定义作用于这些元素的新操作。

    何时使用：

    一个对象结构中，比如某个集合中，包含很多对象，想对集合中的对象增加一些新的操作。
    需要对集合中的对象进行很多不同的并且不相关的操作，而不想修改对象的类，就可以使用访问者模式。访问者模式可以在Visitor类中集中定义一些关于集合中对象的操作。
    优点：

    可以在不改变一个集合中的元素的类的情况下，增加新的施加于该元素上的新操作。
    可以将集合中各个元素的某些操作集中到访问者中，不仅便于集合的维护，也有利于集合中元素的复用。
    访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。

    这个模式可能稍微难理解一点，希望读者一点一点读下去，碰到不清楚的先跳过，看完例子再回过头来基本就清楚是怎么回事了。

    在介绍访问者模式前，先介绍一下分派的概念。

    变量被声明时的类型叫做变量的静态类型(Static Type)，而变量所引用的对象的真实类型又叫做变量的实际类型(Actual Type)，如：
 */
public class Dispatch {
	void print(FatherClass c){
		System.out.println("father class!");
	}
	
	void print(ChildClass c){
		System.out.println("child class !");
	}
	public static void main(String[] args) {
		FatherClass child = new ChildClass();
		new Dispatch().print(child);
		child.print();
	}

}

class FatherClass{
	void print(){
		System.out.println("I'm father!");
	}
}

class ChildClass extends FatherClass{
	void print(){
		System.out.println("I'm child!");
	}
}
