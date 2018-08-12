package patterns.mediator;

//�����н���
public class Midiator {
	PersistentDB persistentDB;// �˴�����ʹ��List��������е�ͬ��
	PersistentFile persistentFile;

	public Midiator setPersistentDB(PersistentDB persistentDB) {
		this.persistentDB = persistentDB;
		return this;
	}

	public Midiator setPersistentFile(PersistentFile persistentFile) {
		this.persistentFile = persistentFile;
		return this;
	}

	public void notifyOther(IPersistent persistent, Object data) {
		if (persistent instanceof PersistentDB)// ���ͬ�¶�����List�У��˴���������
			persistentFile.getData(data);
		if (persistent instanceof PersistentFile)
			persistentDB.getData(data);
	}
}
