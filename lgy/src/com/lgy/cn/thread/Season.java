package com.lgy.cn.thread;

public enum Season {
	Spring,Summer,Autumn,Winter;
		
		
	// is contains name for the season enum option
	
	public static boolean contains(String name){
		Season[] season = values();
		//ergodic search option
		for(Season s : season){
			if(s.name().equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public Season getConfortable(){
		return Spring;
	}
}
