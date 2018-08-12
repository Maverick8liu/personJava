package patterns.builder;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new  MyDate();
		IDateBuilder builder;
		builder = new DateBuilder1(date).buildDate(2066, 3, 5);
		System.out.println(builder.date());
		
		builder = new DateBuilder2(date).buildDate(2066,3 , 5);
		System.out.println(builder.date());
	}

}
