package com.lgy.cn.array;

import java.util.Arrays;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ArrayCopy {
	public static void main(String[] args){
		int ballonNum = 7;
		Balloon[] box1 = new Balloon[ballonNum];
		
		for(int i = 0;i<ballonNum;i++){
			box1[i] = new Balloon(Color.values()[i],i);
			
		}
		
		Balloon[] box2 = Arrays.copyOf(box1, box1.length);
		
		box2[6].setColor(Color.Blue);
		
		for(Balloon b:box1){
			System.out.println(b);
		}
		
	}
}
enum Color{
	Red,Orange,Yellow,Green,Indigo,Blue,Violet;
}

class Balloon{
	private int id;
	private Color color;
	
	public Balloon(Color _color,int _id){
		color = _color;
		id = _id;
	}
	
	
	
	public void setColor(Color _color) {
		// TODO Auto-generated method stub
		color = _color;
	}



	public String toString(){
		return new ToStringBuilder(this).append("±àºÅ",id).append("ÑÕÉ«",color).toString();
	}
	
	
}
