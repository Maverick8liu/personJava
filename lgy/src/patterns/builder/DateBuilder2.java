package patterns.builder;

public class DateBuilder2 implements IDateBuilder{

	private MyDate myDate;
	
	public DateBuilder2(MyDate myDate){
		this.myDate = myDate;
	}
	
	@Override
	public IDateBuilder buildDate(int y, int m, int d) {
		// TODO Auto-generated method stub
		myDate.date = y+"/"+m+"/"+d;
		return this;
	}

	@Override
	public String date() {
		// TODO Auto-generated method stub
		return myDate.date;
	}

}
