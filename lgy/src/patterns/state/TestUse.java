package patterns.state;

public class TestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String smallData = "С����";
		String middleData = "����С���ݺʹ�����֮�������";
		String bidData = "����ͼٶ�����һ���ܴ�ܴ�ܴ������";
		
		SaveDataController controller = new SaveDataController();
		controller.save(smallData);
		controller.save(middleData);
		controller.save(bidData);
	}

}
