package patterns.command;

public class CommandDelete implements Command {
	MakeFile makeFile;
	
	public CommandDelete(MakeFile makeFile) {
		this.makeFile = makeFile;
	}
	@Override
	public void execute(String name) throws Exception {
		// TODO Auto-generated method stub
		makeFile.deleteFile(name);
	}

}
