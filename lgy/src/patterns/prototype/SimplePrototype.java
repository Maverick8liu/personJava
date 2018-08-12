package patterns.prototype;
/**
 * 
 * @author liuguoyu
 *
 *��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���

    ��ʱʹ�ã�

    ������Ҫ��һ������������õ����ɸ�����״̬��ͬ�����ɶ����仯��״̬�Ķ���ʱ��
    ������Ĵ�����Ҫ���������Ĺ�����̺ͱ�ʾʱ��
    һ���ഴ��ʵ��״̬���Ǻܶ࣬��ô�Ϳ��Խ�������һ��ʵ������Ϊԭ�ͣ���ôͨ����ʵ�����Ƹ�ԭ�͵õ��µ�ʵ�����ܱ�����ʹ����Ĺ��췽��������ʵ��������
    �ŵ�:

    �����������ʵ���Ĵ��۸���ʱ��ʹ��ԭ��ģʽ����һ�����е�ʵ��������ߴ�����ʵ����Ч�ʡ�
    ���Զ�̬�ı��浱ǰ�����״̬��������ʱ��������ʱʹ�ö��������浱ǰ�����һ������Ʒ��
    ����������ʱ�����µĶ��󣬶����봴��һϵ����ͼ��ɽṹ��
    ���Զ�̬����ӡ�ɾ��ԭ�͵ĸ���Ʒ��
    ԭ��ģʽҪ�����ʵ��һ�����ԡ���¡������Ľӿڣ������Ϳ���ͨ������һ��ʵ��������������һ���µ�ʵ��������һ����ͨ��ԭ��ʵ�������µĶ��󣬾Ͳ�����Ҫ�������ʵ����������ͣ�ֻҪʵ���˿�¡����ķ������Ϳ���ͨ�������������ȡ�µĶ��󣬶�������ȥͨ��new��������
 */
public class SimplePrototype implements Prototype,Cloneable{
	int value;
	@Override
	public Object cloneSelf() {
		// TODO Auto-generated method stub
		SimplePrototype self = new SimplePrototype();
		self.value = value;
		return self;
	}
	
	public static void main(String[] args) {
		SimplePrototype simplePrototype = new SimplePrototype();
		simplePrototype.value = 80;
		SimplePrototype simplePrototypeClone  = (SimplePrototype) simplePrototype.cloneSelf();
		System.out.println(simplePrototypeClone.value);
	}
	
}

interface Prototype{
	Object cloneSelf();//��¡����ķ���
}

class Client{
	SimplePrototype prototype;
	
	public Client(SimplePrototype prototype){
		this.prototype = prototype;
	}
	
	public Object getPrototype(){
		return prototype.cloneSelf();
	}
	
	
}
