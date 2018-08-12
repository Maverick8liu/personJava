package patterns.command;

public class TestCase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MakeFile makeFile = new MakeFile();
		
		//����
		CommandCreate create = new CommandCreate(makeFile);
		CommandDelete delete = new CommandDelete(makeFile);
		
		//������
		Client client = new Client();
		//ִ������
		client.setCommand(create).executeCommand("D://1/test1.txt");
		client.setCommand(create).executeCommand("D://1/test2.txt");
		client.setCommand(delete).executeCommand("D://1/test1.txt");
		
	}

}
