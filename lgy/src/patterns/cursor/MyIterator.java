package patterns.cursor;

public interface MyIterator<T> {
	boolean hasNext(); //�Ƿ�����һ��Ԫ��
	T next(); //�õ���һ��Ԫ��
	T remove();
}
