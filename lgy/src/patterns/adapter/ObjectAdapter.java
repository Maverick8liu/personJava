package patterns.adapter;

/**
 * ������ģʽ
 * @author Administrator
 * ��һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڡ���ģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ������

    ��ʱʹ��

    һ��������ʹ���Ѿ����ڵ��࣬���Ǹ�����ʵ�ֵĽӿں͵�ǰ������ʹ�õĽӿڲ�һ��ʱ��
    �ŵ�

    Ŀ���뱻�����߽���
    ���㿪-��ԭ��
    ԭ����Ǳ������е������ṩ�ķ����޸���ӿڣ��Ӷ��ﵽ�ͻ��˵�������

    ���ߣ�������Ҳ�ֶ����������������������ȿ���������������͡�

    �ٸ����ӣ�����һ����������ֻ�ܲ���MP3��ʽ�����֣�����������Ҫ���ܲ���flac��ʽ�ģ����ǲ���ֱ��ʹ����������������������һ�������������������⣺
 */
public class ObjectAdapter implements Target{
	private Adaptee adaptee;
	
	public ObjectAdapter() {
		// TODO Auto-generated constructor stub
		super();
		adaptee = new Adaptee();
	}
	@Override
	public void playFlac(Object src) {
		// TODO Auto-generated method stub
		//����ѡӴ��src������
		adaptee.playMp3(src);
	}
	
}

//��������
class Adaptee{
	void playMp3(Object src){
		System.out.println("����MP3��" + src);
	}
}

//Ŀ�꣬Ҳ�����û���ϣ��ʹ�õ�
interface Target{
	void playFlac(Object src);
}
