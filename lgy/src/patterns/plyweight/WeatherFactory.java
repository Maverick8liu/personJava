package patterns.plyweight;

import java.util.HashMap;

//��Ԫ����
public class WeatherFactory {
	private HashMap<IWeather, IWeather> weathers;

	public WeatherFactory() {
		weathers = new HashMap<IWeather, IWeather>();
	}

	public IWeather getFlyWeight(String weather, int temperature) {
		Weather objectWeather = new Weather(weather, temperature);
		IWeather flyweight = weathers.get(objectWeather);
		if (flyweight == null) {
			flyweight = objectWeather;
			weathers.put(objectWeather, flyweight);
		} else
			objectWeather = null;// ����gc����
		return flyweight;
	}

	public int getFlyweightSize() {
		return weathers.size();
	}
}
