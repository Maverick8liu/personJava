package patterns.builder;

/**
 * ����������
 * @author liuguoyu
 *
 */
public interface IDateBuilder {
	IDateBuilder buildDate(int y,int m,int d);
	
	String date();
}
