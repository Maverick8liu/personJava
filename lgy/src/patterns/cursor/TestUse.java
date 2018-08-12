package patterns.cursor;

public class TestUse {
	public static void main(String args[]){
		// �ֱ������ֽṹ
		MyList<String> array = new MyArrayList<String>();
		MyList<String> link = new MyLinkedList<String>();
		// �������
		for (int i = 1; i < 15; i++) {
			array.add(i + "");
			link.add(i + "");
		}
		// �������
		System.out.println(array.remove());
		System.out.println(array.get(5));
		System.out.println(array.remove(5));
		System.out.println(array.get(5));
		System.out.println(array.remove("7"));
		System.out.println(array.set(0, "00"));
		// ʹ�õ�����
		MyIterator<String> ai = array.iterator();
		while (ai.hasNext())
			System.out.print(ai.next() + " ");
		System.out.println();
		System.out.println(link.remove());
		System.out.println(link.get(5));
		System.out.println(link.remove(5));
		System.out.println(link.get(5));
		System.out.println(link.remove("7"));
		System.out.println(link.set(0, "00"));
		// ʹ�õ�����
		MyIterator<String> li = link.iterator();
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();
		System.out.println("a size=" + array.size());
		System.out.println("l size=" + link.size());
	}

}
