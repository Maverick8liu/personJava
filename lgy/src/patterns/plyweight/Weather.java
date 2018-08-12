package patterns.plyweight;
//具体享元
public class Weather implements IWeather {
	private String weather;
	private Integer temperature;
	public Weather(String weather,int temperature){
	this.weather = weather;
	this.temperature = temperature;
	}
	@Override
	public void printWeather() {
	System.out.print("天气:" + weather);
	System.out.println(" 温度:" + temperature);
	}
	@Override
	public boolean equals(Object obj) {//两个值同时相等这个对象才相同
	Weather weather = (Weather)obj;
	return weather.weather.equals(this.weather)&&weather.temperature==temperature;
	}
	@Override
	public int hashCode() {//Integer和String的hashCode()方法都是很合理的，这里取均值即可
	return (weather.hashCode()+temperature.hashCode())/2;
	}
}
