package patterns.adapter;

public class ClassAdapter extends Adaptee implements Target{

	@Override
	public void playFlac(Object src) {
		// TODO Auto-generated method stub
		//������Ҫ��src������
		playMp3(src);
	}

}
