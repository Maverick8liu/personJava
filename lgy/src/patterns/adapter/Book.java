package patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//±ª  ≈‰’ﬂ
public class Book {
	private Vector<String> books;

	public Book() {
		books = new Vector<String>();
	}

	public void add(String book) {
		books.add(book);
	}

	public Enumeration<String> getEnum() {
		return books.elements();
	}

	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
