package patterns.bridge;
/**
 * 
 * @author Administrator
 * �����󲿷�������ʵ�ֲ��ַ��룬ʹ���Ƕ����Զ����ı仯��

    ��ʱʹ�ã�

    �����ó����ĳЩ��Ҫ��ʵ�ִ����ǹ̶��İ󶨹�ϵ���ⲿ��ʵ�ֿ�����ʱ��̬������
    �����ʵ���߶����Լ̳е���ʽ���������������Ӱ�죬�����������ڼ������Ҫ��̬�Ľ�һ������������ʵ����һ��ʵ���ߵ������ʵ��������ϡ�
    ϣ����ʵ���߲�δ�����޸ĶԳ���㲻����Ӱ�죬�������Ĵ��벻��Ҫ���±��룬��֮��Ȼ��
    �ŵ�:

    �Ž�ģʽ����ʵ�������ʹ�����ʵ�ֿ��Զ�������չ�����޸�ʵ�ֵĴ���ʱ����Ӱ�����Ĵ��룬��֮Ҳһ����
    ���㿪��-ԭ�򣬳����ʵ���ߴ���ͬ��Σ�ʹϵͳ�ɶ�������չ��������Ρ������µľ���ʵ���ߣ�����Ҫ�޸�ϸ�����󣬷�֮�����µ�ϸ������Ҳ����Ҫ�޸ľ���ʵ�֡�
    �Ž�ģʽ��һ�ֽṹ��ģʽ������ҪӦ�Ե��ǣ�����ʵ�ʵ���Ҫ��ĳ��������������������ϵ�ά�ȱ仯�����ֻ���ü̳н��޷�ʵ��������Ҫ������ʹ����Ʊ���൱ӷ�ס�

    �Ž�ģʽ�������ǰѱ仯���ֳ��������ʹ�仯������������뿪�����Ӷ������ά�ȵı仯���׷��롣����ṩһ������������ϲ�ͬά���ϵı仯��ͨ���������������ҵ�����Ҫ��

    �Ž�ģʽ����4�ֽ�ɫ��

    ����
    ϸ������
    ʵ����
    ����ʵ����
    ���濴һ�����ӣ������Ǻ������AMD��������һ�����Ӷ���...����
 */
//�Ž�ģʽ
public class SimpleBridge {
	public static void main(String args[]) {
		new LenevoComputer(new Amd()).discribe();
		new HaseeComputer(new Intel()).discribe();
	}
}

// ʵ����
interface Cpu {
	String discribe();
}

// ����ʵ����*2
class Amd implements Cpu {
	public String discribe() {
		return "just so so...";
	}
}

class Intel implements Cpu {
	public String discribe() {
		return "great !";
	}
}

// ����
abstract class AbstractComputer {
	Cpu cpu;

	public AbstractComputer(Cpu cpu) {
		this.cpu = cpu;
	}

	public abstract void discribe();
}

// ϸ������*2
class LenevoComputer extends AbstractComputer {
	public LenevoComputer(Cpu cpu) {
		super(cpu);
	}

	@Override
	public void discribe() {
		System.out.println("����ʼǱ�cpu:" + super.cpu.discribe());
	}
}

class HaseeComputer extends AbstractComputer {
	public HaseeComputer(Cpu cpu) {
		super(cpu);
	}

	@Override
	public void discribe() {
		System.out.println("���۱ʼǱ�cpu:" + super.cpu.discribe());
	}
}// ���������ʼǱ�cpu:just so so... ���۱ʼǱ�cpu:great !
