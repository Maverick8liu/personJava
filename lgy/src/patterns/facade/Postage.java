package patterns.facade;

//�����ʷ�
public class Postage {
	int getPostage(String addr) {
		return Math.abs(addr.hashCode()) % 20 + 6;// ģ���ʷѼ���
	}
}
