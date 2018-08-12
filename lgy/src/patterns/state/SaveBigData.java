package patterns.state;

public enum SaveBigData implements ISaveData{
	instance;

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.println("保存到文件:" + data);
	}

}
