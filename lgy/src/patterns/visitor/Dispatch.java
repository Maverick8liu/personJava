package patterns.visitor;
/**
 * ������ģʽ
 * @author Administrator
 *    ��ʾһ��������ĳ����ṹ�еĸ���Ԫ�صĲ������������ڲ��ı����Ԫ�ص����ǰ���¶�����������ЩԪ�ص��²�����

    ��ʱʹ�ã�

    һ������ṹ�У�����ĳ�������У������ܶ������Լ����еĶ�������һЩ�µĲ�����
    ��Ҫ�Լ����еĶ�����кܶ಻ͬ�Ĳ��Ҳ���صĲ������������޸Ķ�����࣬�Ϳ���ʹ�÷�����ģʽ��������ģʽ������Visitor���м��ж���һЩ���ڼ����ж���Ĳ�����
    �ŵ㣺

    �����ڲ��ı�һ�������е�Ԫ�ص��������£������µ�ʩ���ڸ�Ԫ���ϵ��²�����
    ���Խ������и���Ԫ�ص�ĳЩ�������е��������У��������ڼ��ϵ�ά����Ҳ�����ڼ�����Ԫ�صĸ��á�
    ������ģʽ��Ŀ���Ƿ�װһЩʩ����ĳ�����ݽṹԪ��֮�ϵĲ�����һ����Щ������Ҫ�޸ĵĻ�������������������ݽṹ����Ա��ֲ��䡣

    ���ģʽ������΢�����һ�㣬ϣ������һ��һ�����ȥ������������������������������ٻع�ͷ���������������ô�����ˡ�

    �ڽ��ܷ�����ģʽǰ���Ƚ���һ�·��ɵĸ��

    ����������ʱ�����ͽ��������ľ�̬����(Static Type)�������������õĶ������ʵ�����ֽ���������ʵ������(Actual Type)���磺
 */
public class Dispatch {
	void print(FatherClass c){
		System.out.println("father class!");
	}
	
	void print(ChildClass c){
		System.out.println("child class !");
	}
	public static void main(String[] args) {
		FatherClass child = new ChildClass();
		new Dispatch().print(child);
		child.print();
	}

}

class FatherClass{
	void print(){
		System.out.println("I'm father!");
	}
}

class ChildClass extends FatherClass{
	void print(){
		System.out.println("I'm child!");
	}
}
