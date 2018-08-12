package patterns.builder;
/**
 * �����������
 * @author liuguoyu
 *
 */
public class DateBuilder1 implements IDateBuilder{

	private MyDate myDate;
	
	public DateBuilder1(MyDate mydate){
		this.myDate = mydate;
	}
	
	@Override
	public IDateBuilder buildDate(int y, int m, int d) {
		// TODO Auto-generated method stub
		myDate.date = y+"-"+m+"-"+d;
		return this;
	}

	@Override
	public String date() {
		// TODO Auto-generated method stub
		return myDate.date;
	}

}
