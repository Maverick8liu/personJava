package patterns.observer;
/**
 * 
 * 
 * �۲���ģʽ
 * @author Administrator
 *  ���������һ��һ�Զ��������ϵ����һ������״̬�����ı�ʱ�������������Ķ��󶼵õ�֪ͨ�����Զ����¡�

    ��ʱʹ��

    ��һ����������ݸ���ʱ����Ҫ֪ͨ�������󣬶��ֲ�ϣ���ͱ�֪ͨ�Ķ����γɽ����ʱ
    �ŵ�

    ...

    ���������и������������⣩��Ȼ���ж��ʹ�����Ŀͻ��ˣ��۲��ߣ�������android��iphone��app�ķ��񣨹۲��ߣ�����ô�Ϳ���ʹ����ôģʽ��
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
