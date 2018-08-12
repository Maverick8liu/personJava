package patterns.memento;

import java.util.LinkedList;

//�ı��༭��
public class TextEditor {
	public static void main(String[] args) {
		// ʹ������ı��༭��
		MyTextEditor editor = new MyTextEditor("�����ǳ�ʼ�ı�������Ϊ�ļ��ж�ȡ��ֵ��");
		System.out.println("��ʼ�޸��ı���");
		editor.append("�������1");
		editor.delWords(); // ɾ�����һ��
		// editor.delWords(2); //ɾ�����2�� ������������û������ģ�����������̨���̫�࣬ȡ���������޸�
		// editor.delWords(1,5); //ɾ��ǰ��5��
		System.out.println("��ʼ�ָ���");
		for (int i = 0; i < 10; i++)
			editor.recoverMemento();// �ָ�����ʵ���޸ĵĴ����������ֻ�Ὣ�ı���Ϊo��ʼ��״̬
		System.out.println("��ʼ������");
		for (int i = 0; i < 10; i++)
			editor.redo(); // ��������ʵ�ʻָ��Ĵ����������ֻ�Ὣ�ı���Ϊ���״̬
		System.out.println("�ٴλָ���");
		for (int i = 0; i < 10; i++)
			editor.recoverMemento();// �ָ�����ʵ���޸ĵĴ����������ֻ�Ὣ�ı���Ϊo��ʼ��״̬
		System.out.println("�ٴ�������");
		for (int i = 0; i < 10; i++)
			editor.redo(); // ��������ʵ�ʻָ��Ĵ����������ֻ�Ὣ�ı���Ϊ���״̬
		System.out.println("�ٴλָ���");
		for (int i = 0; i < 10; i++)
			editor.recoverMemento();// �ָ�����ʵ���޸ĵĴ����������ֻ�Ὣ�ı���Ϊo��ʼ��״̬
		editor.append("�������2");
		System.out.println("�ٴ�������");
		for (int i = 0; i < 10; i++)
			editor.redo(); // ��������ʵ�ʻָ��Ĵ����������ֻ�Ὣ�ı���Ϊ���״̬
	}
}


// �����˼渺����
class MyTextEditor {
	public StringBuffer text;
	private LinkedList<IMemento> mementos; // �������
	private LinkedList<IMemento> undos; // ���泷���Ĳ���

	public MyTextEditor() {
		this("");
	}

	public MyTextEditor(String defaultStr) {
		text = new StringBuffer(defaultStr);
		mementos = new LinkedList<IMemento>();
		undos = new LinkedList<IMemento>();
		print();
	}

	public void clearHistory() {
		mementos.clear();
		undos.clear();
	}

	public void append(String appendStr) {
		if (appendStr == null || appendStr.length() == 0)
			return;
		createMemento();
		text.append(appendStr);
		print();
		undos.clear();
	}

	// ɾ�����һ��
	public void delWords() {
		delWords(1);
	}

	// ɾ�����n��
	public void delWords(int n) {
		if (n < 1 || n > text.length())
			return;
		delWords(text.length() - n + 1, text.length());
	}

	// ɾ���м�start��end���ַ�,��һ������Ϊ��һ��(������0)
	public void delWords(int start, int end) {
		if (start < 1 || end > text.length() + 1)
			return;
		createMemento();
		text = text.delete(start - 1, end);
		print();
	}

	public void reset(String text) {
		this.text = new StringBuffer(text);
	}

	// �µĿ���
	public void createMemento() {
		mementos.push(new Memento(this));
	}

	// �ָ�״̬
	public boolean recoverMemento() {
		Memento memento = (Memento) mementos.poll();
		if (memento == null)
			return false;
		undos.push(new Memento(this));
		reset(memento.state);
		print();
		return true;
	}

	// redo,redo�Ĳ���Ҳ���Իָ���
	public boolean redo() {
		Memento memento = (Memento) undos.poll();
		if (memento == null)
			return false;
		createMemento();
		reset(memento.state);
		print();
		return true;
	}

	// �ڲ���ʵ�ֱ���¼
	private class Memento implements IMemento {
		private String state;

		private Memento(MyTextEditor editor) {
			this.state = editor.text.toString();
		}
	}

	void print() {
		System.out.println("��ǰ�ı���" + text);
	}
}
