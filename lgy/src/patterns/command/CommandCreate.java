package patterns.command;

public class CommandCreate implements Command{
	MakeFile makeFile;
	
	 public CommandCreate(MakeFile makeFile) {
		 // TODO Auto-generated constructor stub
		 this.makeFile = makeFile;
	}	
	@Override
	public void execute(String name) throws Exception {
		// TODO Auto-generated method stub
		makeFile.createFile(name);
	}

}
