package patterns.strategy;

public class SaveToMysql implements ISaveData {

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.println("data:"+data+" save to mysql!");
	}

}
