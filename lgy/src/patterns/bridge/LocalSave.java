package patterns.bridge;

//ϸ������
public class LocalSave extends AbstractSave {
	public LocalSave(ISaveData saveData) {
		super(saveData);
	}

	

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.print("���ش洢��");
		saveData.save(data);
	}
}