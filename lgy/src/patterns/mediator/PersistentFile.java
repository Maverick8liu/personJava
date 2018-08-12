package patterns.mediator;

//����ͬ��
public class PersistentFile implements IPersistent {
	private Object data;

	@Override
	public void getData(Object data, Midiator midiator) {
		getData(data);
		midiator.notifyOther(this, data);
	}

	@Override
	public void saveData() {
		System.out.println(data + " �ѱ��浽�ļ�");
	}

	@Override
	public void getData(Object data) {
		this.data = data;
		saveData();
	}
}