package com.lgy.cn.thread;

import java.util.Random;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args){
		//train ticket list
		//final List<String> tickets = new ArrayList<String>();
		final Vector<String> tickets = new Vector<String>();
		
		//initial ticket pool
		for(int i = 0;i<100000;i++){
			tickets.add("ticket"+i);
		}
		
		//refund ticket
		Thread returnThread = new Thread(){
			public void run(){
				while(true){
					tickets.add("ticket"+new Random().nextInt());
				}
			}
		};
		
		//sale ticket
		Thread saleThread = new Thread(){
			public void run(){
				for(String ticket : tickets){
					tickets.remove(ticket);
				}
			}
		};
		
		// start refund thread 
		returnThread.start();
		//start sale thread
		saleThread.start();
	}
}
