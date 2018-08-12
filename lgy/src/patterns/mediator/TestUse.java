package patterns.mediator;

public class TestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object data = "Êý¾Ý";
		PersistentDB persistentDB = new PersistentDB();
		PersistentFile persistentFile = new PersistentFile();
		Midiator midiator = new Midiator();
		midiator.setPersistentDB(persistentDB).setPersistentFile(persistentFile);
		persistentDB.getData(data, midiator);
		persistentFile.getData(data, midiator);
	}

}
