package lgy.com.cn;

import java.text.NumberFormat;

public class Client {
	
	
	public void  calPrice(int price,int discount){
		float knockdownPrice = price * discount/100.0f;
		System.out.println("���ۿۺ�ļ۸�Ϊ:"+formateCurrentcy(knockdownPrice));
	}
	
	//���ۿۼ���
	public void calPrice(int price,int... discounts){
		float knockdownPrice = price;
		for(int discount:discounts){
			knockdownPrice = knockdownPrice* discount/100;
		}
		
		System.out.println("�����ۿۺ�ļ۸�Ϊ:"+formateCurrentcy(knockdownPrice));
		
	}

	//��ʽ��Ϊ������ʽ
	private String formateCurrentcy(float price){
		return NumberFormat.getCurrencyInstance().format(price/100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.calPrice(49900, 75);
		
		client.calPrice(49900, 75,95);
	}

}
