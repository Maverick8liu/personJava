package patterns.observer;

public class ClientIphoneServer implements Client {
	private static String name = "ƻ������";
	private WeatherInfo info;
	@Override
	public void getWeather(WeatherInfo info) {
		// TODO Auto-generated method stub
		this.info = info;
		dealMsg();
		
	}
	private void dealMsg() {
		// TODO Auto-generated method stub
		System.out.println(name + "�յ�����������time="+info.getTime()+"msg = "+info.getWeather()+"�����Ͽ�ʼ������Ϣ...");
	}

}
