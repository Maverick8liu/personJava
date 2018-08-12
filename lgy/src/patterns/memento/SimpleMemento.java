package patterns.memento;

/**
 * ����¼ģʽ
 * @author Administrator
 *�ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ���״̬�������Ϳ��Խ��ö���ָ���֮ǰ�����״̬��

    ��ʱʹ�ã�

    ���뱣��һ��������ĳһʱ�̵�ȫ���򲿷�״̬���Ա�����Ҫʱ�ָ��ö�����ǰ��״̬��
    һ��������ͨ���ṩpublicȨ�޵ģ�����getXXX()�ķ�������������õ��Լ�IDE�ڲ�״̬��
    �ŵ㣺

    ����¼ģʽʹ�ñ���¼���԰�ԭ���ߵ��ڲ�״̬ȫ������������ʹ���кܡ����ܡ��Ķ�����Է��ʱ���¼�е����ݡ�
    ����¼ģʽǿ��������Ƶ�һ���ε�ԭ�򣬼���״̬�Ŀ̻��ͱ���ֿ���
    ����¼ģʽ�ֽ�������ģʽ(Snapshot Pattern)��Tokenģʽ���Ƕ������Ϊģʽ�� ����¼������һ�������洢����һ�������ڲ�״̬�Ŀ��յĶ���

    ����¼ģʽ�������ֽ�ɫ��

    ����¼(Memento)��ɫ���������ˣ�Originator���������ս״̬�洢����������¼���Ը��ݷ����˶�����ж��������洢���ٷ����ˣ�Originator��������ڲ�״̬������¼���Ա��������ݲ��������ˣ�Originator������֮����κζ�������ȡ��
    �����ˣ�Originator����ɫ������һ�����е�ǰ���ڲ�״̬�ı���¼����ʹ�ñ���¼����洢���ڲ�״̬��
    �����ˣ�Caretaker����ɫ�����𱣴汸��¼���󡣲���鱸��¼��������ݡ�
 */
public class SimpleMemento {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*Originator originator = new Originator(); //�����ˣ�Ҫ������Ķ���,Ҳ��������Ҫ�������Ϣ��
		Caretaker caretaker = new Caretaker(); //��������Ķ���
		originator.setState("stateOne"); //����״̬
		caretaker.saveMemento(originator.createMemento()); //����״̬
		originator.setState("stateTwo"); //�޸�״̬
		originator.recoverMemento(caretaker.recoverMemento()); //�ָ�״̬
*/		
		Orginator originator = new Orginator();
		Caretaker caretaker = new Caretaker();
		originator.setState("stateOne");
		caretaker.saveMemento(originator.createMemento());
		originator.setState("stateTwo");
		originator.recoverMemento(caretaker.recoverMemento());
	}

}

class Orginator{
	private String state;
	
	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void recoverMemento(Memento memento){
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

//����¼
class Memento{
	private String state;
	public Memento(String state){
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
//������
class Caretaker{
	private Memento memento;
	
	public Memento recoverMemento() throws Exception{
		if(memento == null)
			throw new Exception("û�б���״̬��");
		return this.memento;
	}
	
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	
}