package patterns.observer;

public interface IWeatherService {
	void addClient(Client client);//��ӹ۲���
	boolean deleteClient(Client client);//ɾ���۲���
	void notifyClients();//֪ͨ
	void updateWeather(WeatherInfo info);//�������ݸ���
}
