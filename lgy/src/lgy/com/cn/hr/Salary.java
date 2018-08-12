package lgy.com.cn.hr;

import java.io.Serializable;

public class Salary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public int getBasePay() {
		return basePay;
	}


	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}


	//基本工资
	private int basePay;
	//绩效工资
	private int bonus;
	
	
	public Salary(int _basePay,int _bonus){
		this.basePay = _basePay;
		this.bonus = _bonus;
	}
	
	
	
}
