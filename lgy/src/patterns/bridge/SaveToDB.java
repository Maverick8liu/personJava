package patterns.bridge;

//����ʵ��
public class SaveToDB implements ISaveData {
	@Override
	public void save(Object data) {
		System.out.println(data + " �洢�����ݿ�");
	}
}