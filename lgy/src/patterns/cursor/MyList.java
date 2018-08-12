package patterns.cursor;
//���Ͻӿ�
public interface MyList<T> {
	MyIterator<T> iterator();//���ر�����
	
	boolean add(T t);
	
	T get(int index); //�õ�Ԫ��
	
	T remove(); //ɾ�����һ��Ԫ��
	
	boolean remove(T element); //ɾ��ָ��Ԫ��
	
	T remove(int index); //ɾ��ָ��λ��Ԫ��
	
	boolean set(int index,T element); //�޸�ָ��λ��ֵ
	
	int size();
}
