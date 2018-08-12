package patterns.bridge;

//ϸ������
public class NetSave extends AbstractSave {
	public NetSave(ISaveData saveData) {
		super(saveData);
	}

	@Override
	public void save(Object data) {
		System.out.print("����洢��");
		saveData.save(data);
	}
}
