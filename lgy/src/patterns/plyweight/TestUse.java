package patterns.plyweight;

public class TestUse {
	public static void main(String args[]) {
		WeatherFactory factory = new WeatherFactory();
		IWeather weather1, weather2, weather3, weather4, weather5, weather6, weather7, weather8;
		weather1 = factory.getFlyWeight("����", 15);
		weather2 = factory.getFlyWeight("��", 23);
		weather3 = factory.getFlyWeight("����", 16);
		weather4 = factory.getFlyWeight("��", 10);
		weather5 = factory.getFlyWeight("����", 15);
		weather6 = factory.getFlyWeight("����", 15);
		weather7 = factory.getFlyWeight("����", 15);
		weather8 = factory.getFlyWeight("����", 15);
		weather1.printWeather();
		weather2.printWeather();
		weather3.printWeather();
		weather4.printWeather();
		weather5.printWeather();
		weather6.printWeather();
		weather7.printWeather();
		weather8.printWeather();
		System.out.println("ʵ�ʶ������" + factory.getFlyweightSize());
	}
}
