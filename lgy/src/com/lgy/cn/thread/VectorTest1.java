package com.lgy.cn.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final List<String> tickets = new ArrayList<String>();
		final Vector<String> tickets = new Vector<String>();
		//initial tic//initial ticket pool
		for(int i = 0;i<100000;i++){
			tickets.add("ticket"+i);
		}
		
		for(int i = 0;i<10;i++){
			new Thread(){
				public void run(){
					while(true){
						System.out.println(Thread.currentThread().getId()+"-"+tickets.remove(0));
					}
				}
			}.start();
		}
	}

}
