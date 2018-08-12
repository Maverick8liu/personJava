package patterns.composite;

import java.util.Iterator;
import java.util.List;
/**
 * 组合模式
 * @author Administrator
 * 将对象组合成树形结构以表示“部分-整体”的层次结构。Composite使用户对单个对象和组合对象的使用具有一致性。

    何时使用：

    当想表示对象的部分-整体层次结构。
    希望用户用一致的方式处理个体对象和组合对象。
    优点：

    组合模式中包含个体对象和组合对象，并形成树形结构，使用户可以方便地处理个体对象和组合对象。
    组合对象和个体对象实现了相同的接口，用户一般无须区分个体对象和组合对象。
    当增加新的Composite节点和Leaf节点时，用户的重要代码不需要做出修改。
    组合模式有时候又叫做部分-整体模式，它使我们树型结构的问题中，模糊了简单元素和复杂元素的概念 ，客户程序可以向处理简单元素一样来处理复杂元素,从而使得客户程序与复杂元素的内部结构解耦。组合模式让你可以优化处理递 归或分级数据结构。有许多关于分级数据结构的例子，使得组合模式非常有用武之地。关于分级数据结构的一个普遍性的例子是电脑的文件系统。下面我们就以这个例子来介绍组合模式（虽然我们直接使用Tree这种数据结构也能直接描述）。

    一个文件系统中，有目录，目录下有文件和目录

    目录和文件的抽象接口（抽象组件）：
 */
//抽象组件
public interface Component {
	void addFile(Component file);

	Component addFolder(Component folder);

	void removeFile(Component file);

	void removeFolder(Component folder);

	List<Component> getFiles();

	List<Component> getFolders();

	List<Component> getAll();

	Iterator<Component> iterator();

	void display();
}