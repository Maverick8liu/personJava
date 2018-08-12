package patterns.adapter;

import java.util.Iterator;

public class BookAdapter extends Book implements Iterable<String>{

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new IteratorAdapter(getEnum());
	}

}
