package patterns.bridge;

//����
public abstract class AbstractSave {
	ISaveData saveData;

	public AbstractSave(ISaveData saveData) {
		this.saveData = saveData;
	}

	public abstract void save(Object data);

	
}