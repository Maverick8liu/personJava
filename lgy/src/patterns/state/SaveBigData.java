package patterns.state;

public enum SaveBigData implements ISaveData{
	instance;

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.println("���浽�ļ�:" + data);
	}

}
