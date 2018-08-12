package patterns.observer;

public class ClientAndroidServer implements Client{
	private static String name ="安卓服务";
	private WeatherInfo info;
	@Override
	public void getWeather(WeatherInfo info) {
		// TODO Auto-generated method stub
		this.info = info;
		dealMsg();
	}
	private void dealMsg() {
		// TODO Auto-generated method stub
		System.out.println(name + "收到最新天气：time="+info.getTime()+"msg="+info.getWeather()+"。马上开始推送消息...");
	}

}
