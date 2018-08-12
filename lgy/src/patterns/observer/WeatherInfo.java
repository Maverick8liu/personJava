package patterns.observer;
/**
 * 
 * 
 * 观察者模式
 * @author Administrator
 *  定义对象间的一种一对多的依赖关系，当一个对象状态发生改变时，所有依赖它的对象都得到通知并被自动更新。

    何时使用

    当一个对象的数据更新时，需要通知其他对象，而又不希望和被通知的对象形成紧耦合时
    优点

    ...

    比如我们有个天气服务（主题），然后有多个使用它的客户端（观察者），包括android和iphone端app的服务（观察者），那么就可以使用这么模式。
 */
public class WeatherInfo {
	private long time;
	private String weather;
	
	public WeatherInfo(long time,String weather) {
		// TODO Auto-generated constructor stub
		this.time = time;
		this.weather = weather;
	}
	
	
	public long getTime() {
		return time;
	}


	public void setTime(long time) {
		this.time = time;
	}


	public String getWeather() {
		return weather;
	}


	public void setWeather(String weather) {
		this.weather = weather;
	}


	public boolean equals(Object obj){
		WeatherInfo info = (WeatherInfo) obj;
		return info.time == this.time && info.weather.equals(this.weather);
	}
	
}
