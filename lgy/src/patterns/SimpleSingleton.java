package patterns;

/**
 * java �еĵ���ģʽ�е����еı���ģʽ
 * 
 * ��֤һ�������һ��ʵ�������ṩһ����������ȫ�ַ��ʵ㡣
 *  ����ģʽ����Ψһʵ�����䱾����ƣ����ԺܺõĿ����û���ʱ��������
    ����ģʽ����ܼ򵥣�����Ҳ�Ƚϳ��á�

    ��ʹ�����ģʽ��ʱ������Ҫ�����Ƿ���ڶ��߳���ʹ�ã��������Ӧ���ڶ��̣߳���д�����㹻�򵥣�
 * @author liuguoyu
 *
 */
public class SimpleSingleton {
	private static SimpleSingleton instance;
	
	private SimpleSingleton(){}
	
	
	public static SimpleSingleton getIntance(){
		if(instance == null)
			instance = new SimpleSingleton();
		
		return instance;
	}
}
