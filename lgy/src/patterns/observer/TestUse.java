package patterns.observer;

public class TestUse {
 public static void main(String[] args) {
	//��������
	 WeatherService service = WeatherService.instance;
	 //��ӹ۲���
	 service.addClient(new ClientAndroidServer());
	 service.addClient(new ClientIphoneServer());
	 
	 //����z����
	 service.updateWeather(new WeatherInfo(System.currentTimeMillis(), "����"));
	 service.updateWeather(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24, "����ת��"));
	 service.updateWeather(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24, "��"));
	 
	 
}
}
