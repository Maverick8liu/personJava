package patterns.facade;

import java.util.Random;

//�����ϵͳ
public class Stock {
	boolean hasStock(String product) {
		return new Random().nextInt(Math.abs(product.hashCode())) > 0;// ģ���Ƿ��п��
	}
}