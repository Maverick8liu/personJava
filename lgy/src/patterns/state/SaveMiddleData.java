package patterns.state;


public enum SaveMiddleData implements ISaveData {
	instance;

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.println("±£´æµ½Mysql:" + data);
	}

}
