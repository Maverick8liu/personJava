package patterns.adapter;

public class ClassAdapter extends Adaptee implements Target{

	@Override
	public void playFlac(Object src) {
		// TODO Auto-generated method stub
		//可能需要对src作处理
		playMp3(src);
	}

}
