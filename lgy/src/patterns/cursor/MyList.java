package patterns.cursor;
//集合接口
public interface MyList<T> {
	MyIterator<T> iterator();//返回遍历器
	
	boolean add(T t);
	
	T get(int index); //得到元素
	
	T remove(); //删除最后一个元素
	
	boolean remove(T element); //删除指定元素
	
	T remove(int index); //删除指定位置元素
	
	boolean set(int index,T element); //修改指定位置值
	
	int size();
}
