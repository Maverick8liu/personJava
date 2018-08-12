package patterns.adapter;

import java.util.Iterator;

public class TestUse {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Adaptee adaptee = new Adaptee();
		adaptee.playMp3("mp3");
		Target target = new ClassAdapter();
		target.playFlac("flac");
		target = new ObjectAdapter();
		target.playFlac("flac");
	}
	
	public static void main(String args[]){
		Book books = new BookAdapter();
		books.add("think in java");
		books.add("c++ primer");
		books.add("ÒÁË÷Ô¢ÑÔ");
		Iterator<String> iterator = books.iterator();
		while(iterator.hasNext()){
		System.out.println(iterator.next());
		}
		}

}
