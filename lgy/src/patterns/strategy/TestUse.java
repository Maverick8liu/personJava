package patterns.strategy;

public class TestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object data = "test";
		ISaveData saveData = new SaveToRedis();
		SaveClient client = new SaveClient(saveData);
		
		client.save(data);
		client.setSaveData(new SaveToFile());
		client.save(data);
	}

}
