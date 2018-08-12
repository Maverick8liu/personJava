package com.lgy.cn.thread;

import java.util.Arrays;
import java.util.List;

public class TestValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> params = Arrays.asList("Spring","summer");
		
		for(String name : params){
			//
			if(Season.contains(name)){
				Season s = Season.valueOf(name);
				System.out.println(s.ordinal());
			}else{
				System.out.println("no have enum option");
			}
			/*Season s = Season.valueOf(name);
			if(s != null){
				System.out.println(s);
			}else{
				System.out.println("no have enum option");
			}*/
		}
	}

}
