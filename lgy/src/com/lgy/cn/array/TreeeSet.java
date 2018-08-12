package com.lgy.cn.array;

import java.util.*;

public class TreeeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = new Integer[]{3,5,9,1,6,8};
		System.out.println(getSecond(data));
	}
	
	public static int getSecond(Integer[] data){
		List<Integer> dataList =  Arrays.asList(data);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(dataList);
		
		return ts.lower(ts.last());
		
	}

}
