package patterns;

/**
 * ����һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡣ��������ʹһ�����ʵ�����ӳٵ������ࡣ
 * @author liuguoyu
 *
 * ��ʱʹ��

    �û���Ҫһ����������ʵ��������ϣ�������������γ����
    �û���Ҫһ����������ʵ�������û���֪����������Щ�������
    �ŵ�

    ʹ�ù��������������û��Ĵ����ĳ���ض��������Ĵ������
    ��������ʹ�û�����֪������ʹ�õĶ����������������ģ�ֻ��֪���ö�������Щ�������ɡ�
    �򵥹���ģʽ

    ���ܹ�������ģʽǰ���Ƚ���һ�¼򵥹���ģʽ���򵥹���ģʽҲ��һ�ֹ�������ģʽ��

    �򵥹���ģʽ�ֳƾ�̬��������ģʽ���������ϾͿ��Կ������ģʽһ���ܼ򵥡������ڵ�Ŀ�ĺܼ򵥣�����һ�����ڴ�������Ľӿڡ�
 *
 */
/*public class SimpleFactory {
	public static void main(String[] args) {
		try {
			Factory factory = new Factory();
			factory.produce("PRO5").run();
			factory.produce("PRO6").run();
			factory.produce("MX6").run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

*//**
 * �����Ʒ
 * @author liuguoyu
 *
 *//*
interface MeizuPhone{
	void run();
}

*//**
 * �����Ʒ
 * @author liuguoyu
 *
 *//*
class Pro5 implements MeizuPhone{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm PRO5");
	}
}

class Pro6 implements MeizuPhone{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm PRO6");
	}
}
//������
class Factory{
	MeizuPhone produce(String product) throws Exception{
		if("PRO5".equals(product)){
			return new Pro5();
		}else if("PRO6".equals(product)){
			return new Pro6();
		}
		throw new Exception("No such Class");
	}
}
*/
