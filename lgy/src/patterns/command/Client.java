package patterns.command;

public class Client {
	Command command;
	
	public Client setCommand(Command command){
		this.command = command;
		return this;
	}
	
	public void executeCommand(String name) throws Exception{
		if(command == null)
			throw new Exception("���û��Ϊ�գ�");
		command.execute(name);
	}
	
}
