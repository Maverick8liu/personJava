package patterns.observer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public enum WeatherService implements IWeatherService {
	instance;
	private LinkedList<WeatherInfo>  weatherInfos = new LinkedList<WeatherInfo>();
	private LinkedHashSet<Client> clients = new LinkedHashSet<Client>(); //¥Ê∑≈π€≤Ï’ﬂ
	
	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		clients.add(client);
	}

	@Override
	public boolean deleteClient(Client client) {
		// TODO Auto-generated method stub
		return clients.remove(client);
	}

	@Override
	public void notifyClients() {
		// TODO Auto-generated method stub
		Iterator<Client> iterator = clients.iterator();
		while(iterator.hasNext()){
			iterator.next().getWeather(weatherInfos.peekFirst());
		}
	}

	@Override
	public void updateWeather(WeatherInfo info) {
		// TODO Auto-generated method stub
		if(weatherInfos.size() > 0)
			if(weatherInfos.peekFirst().equals(info))return;
		weatherInfos.push(info);
		if(clients.size() == 0)return;
		notifyClients();
	}

}
