package patterns.state;

public class TestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String smallData = "小数据";
		String middleData = "介于小数据和大数据之间的数据";
		String bidData = "这里就假定这是一个很大很大很大的数据";
		
		SaveDataController controller = new SaveDataController();
		controller.save(smallData);
		controller.save(middleData);
		controller.save(bidData);
	}

}
