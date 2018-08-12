package patterns.strategy;

public class SaveToRedis implements ISaveData {

	@Override
	public void save(Object data) {
		// TODO Auto-generated method stub
		System.out.println("data:"+data+"save to redis!");
	}

}
