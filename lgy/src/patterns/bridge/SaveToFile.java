package patterns.bridge;

//����ʵ��
public class SaveToFile implements ISaveData {
	@Override
	public void save(Object data) {
		System.out.println(data + " �洢���ļ�");
	}
	
	
}