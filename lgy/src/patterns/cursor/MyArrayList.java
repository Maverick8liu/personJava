package patterns.cursor;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
	private int size; //��ŵ�Ԫ�ظ���,��Ĭ�ϳ�ʼ��Ϊ0
	private Object[] defaultList; //ʹ��������Ԫ��
	private static final int defaultLength = 10;//Ĭ�ϳ���
	
	public MyArrayList(){ //Ĭ�Ϲ��캯��
		defaultList = new Object[defaultLength];
	}
	
	@Override
	public MyIterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator();
	}
	//��С�Զ�����
	private void ensureCapacity(int capacity){
		int nowLength = defaultList.length;
		if(capacity >= nowLength)
			nowLength = nowLength + (nowLength>>1);
		if(nowLength < 0)//���
			nowLength = Integer.MAX_VALUE;
		defaultList = Arrays.copyOf(defaultList, nowLength);
			
	}

	@Override
	public boolean add(T t) {
		// TODO Auto-generated method stub
		ensureCapacity(size+1);
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size)return null;
		return (T) defaultList[index];
	}
	
	

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return remove(size - 1);
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		if(element == null){
			for(int i = 0;i<size;i++){
				if(defaultList[i] == null)
					System.arraycopy(defaultList, i+1, defaultList, i, size -i-1);
				size--;
				return true;
			}
		}else{
			for (int i = 0; i < size; i++)
				if (defaultList[i].equals(element)) {
					System.arraycopy(defaultList, i + 1, defaultList, i, size - i - 1);
					size--;
					return true;
				}
		}
		
		return false;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size)return null;
		T elememnt = (T) defaultList[index];
		if(index != size - 1)
			System.arraycopy(defaultList, index+1, defaultList, index, size-index-1);
		size--;
		return elememnt;
	}

	@Override
	public boolean set(int index, T element) {
		if (index < 0 || index >= size)
			return false;
		defaultList[index] = element;
		return true;
	}

	@Override
	public int size() {
		return size;
	}

	
	// ������
	private class Iterator implements MyIterator<T> {
		private int next;

		@Override
		public boolean hasNext() {
			return next < size;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			return (T) defaultList[next++];
		}

		@Override
		public T remove() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}


