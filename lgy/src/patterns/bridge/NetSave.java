package patterns.bridge;

//Ï¸»¯³éÏó
public class NetSave extends AbstractSave {
	public NetSave(ISaveData saveData) {
		super(saveData);
	}

	@Override
	public void save(Object data) {
		System.out.print("ÍøÂç´æ´¢£º");
		saveData.save(data);
	}
}
