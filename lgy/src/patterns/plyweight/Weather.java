package patterns.plyweight;
//������Ԫ
public class Weather implements IWeather {
	private String weather;
	private Integer temperature;
	public Weather(String weather,int temperature){
	this.weather = weather;
	this.temperature = temperature;
	}
	@Override
	public void printWeather() {
	System.out.print("����:" + weather);
	System.out.println(" �¶�:" + temperature);
	}
	@Override
	public boolean equals(Object obj) {//����ֵͬʱ�������������ͬ
	Weather weather = (Weather)obj;
	return weather.weather.equals(this.weather)&&weather.temperature==temperature;
	}
	@Override
	public int hashCode() {//Integer��String��hashCode()�������Ǻܺ���ģ�����ȡ��ֵ����
	return (weather.hashCode()+temperature.hashCode())/2;
	}
}
