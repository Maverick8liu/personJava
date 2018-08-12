package patterns.state;

public enum SaveSmallData implements ISaveData {
	instance;

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.println("±£³Öµ½Redis:"+data);
	}

}
