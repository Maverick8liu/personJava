package lgy.com.cn;

import java.text.NumberFormat;

public class Client {
	
	
	public void  calPrice(int price,int discount){
		float knockdownPrice = price * discount/100.0f;
		System.out.println("简单折扣后的价格为:"+formateCurrentcy(knockdownPrice));
	}
	
	//多折扣计算
	public void calPrice(int price,int... discounts){
		float knockdownPrice = price;
		for(int discount:discounts){
			knockdownPrice = knockdownPrice* discount/100;
		}
		
		System.out.println("复杂折扣后的价格为:"+formateCurrentcy(knockdownPrice));
		
	}

	//格式化为货币形式
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
