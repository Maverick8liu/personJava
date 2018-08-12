package patterns.strategy;

public class SaveClient {
	private ISaveData saveData;
	public SaveClient(ISaveData saveData) {
		// TODO Auto-generated constructor stub
		this.saveData = saveData;
	}
	public void setSaveData(ISaveData saveData) {
		this.saveData = saveData;
	}
	
	public void save(Object data){
		saveData.save(data);
	}
}
