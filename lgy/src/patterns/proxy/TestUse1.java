package patterns.proxy;

import java.util.Iterator;
import java.util.LinkedList;

//LinkedList��ʹ��
public class TestUse1 {
	public static void main(String[] args) {
		// ջ
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 10; i++)
			stack.push(i);
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next());
		System.out.println();
		// ����
		Queue<Integer> queue = new Queue<Integer>();
		for (int i = 0; i < 10; i++)
			queue.enqueue(i);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		iterator = queue.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next());
	}
}

// ��ʹ��ʹ�ô���ģʽ����LinkedListʵ��һ��ջ
class Stack<T> implements Iterable<T> {
	private LinkedList<T> stack = new LinkedList<T>();

	public T pop() {// ��ջ����ɾ��ջ��Ԫ��
		return stack.poll();
	}

	public T peek() {// ��ջ,����ɾ��ջ��Ԫ��
		return stack.peek();
	}

	public void push(T t) {// ��ջ
		stack.push(t);
	}

	@Override
	public Iterator<T> iterator() {
		return stack.iterator();
	}
}

// ��ʹ��ʹ�ô���ģʽ����LinkedListʵ��һ������
class Queue<T> implements Iterable<T> {
	private LinkedList<T> queue = new LinkedList<T>();

	public void enqueue(T t) {
		queue.offer(t);
	}

	public T dequeue() {
		return queue.poll();
	}

	public T peek() {
		return queue.peek();
	}

	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}
}
