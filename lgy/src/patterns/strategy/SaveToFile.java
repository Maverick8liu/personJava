package patterns.strategy;

public class SaveToFile implements ISaveData {

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.println("data:"+data+" save to file!");
	}

}
