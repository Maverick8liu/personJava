package patterns.memento;

//������ʷ����¼
public class MementoSelf {
public static void main(String[] args) {
OriginatorCaretaker originatorCaretaker = new OriginatorCaretaker();//�����ˣ�ͬʱΪ������
originatorCaretaker.changeState("stateOne"); //�ı�״̬
IMemento memento = originatorCaretaker.createMemento(); //����״̬
originatorCaretaker.changeState("stateTwo"); //�ı�״̬
originatorCaretaker.recoverMemento(memento); //�ָ�״̬
}
}
interface IMemento {}
//�����˼渺����
class OriginatorCaretaker {
public String state;
public void changeState(String state){
this.state = state;
}
//�������
public Memento createMemento(){
return new Memento(this);
}
//�ָ�״̬
public void recoverMemento(IMemento memento){
Memento m = (Memento)memento;
changeState(m.state);
}
//�ڲ���ʵ�ֱ���¼
private class Memento implements IMemento{
private String state;
private Memento(OriginatorCaretaker originatorCaretaker){
this.state = originatorCaretaker.state;
}
}
}
