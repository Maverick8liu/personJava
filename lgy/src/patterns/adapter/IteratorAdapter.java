package patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;
//��������Ŀ�����Iterator������������Enumeration
public class IteratorAdapter implements Iterator<String> {

	Enumeration<String> myEnum;
	public IteratorAdapter(Enumeration<String> myEnum){
	this.myEnum = myEnum;
	}
	@Override
	public boolean hasNext() {
	return myEnum.hasMoreElements();
	}
	@Override
	public String next() {
	return myEnum.nextElement();
	}
}
