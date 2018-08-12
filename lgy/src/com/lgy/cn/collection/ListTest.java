package com.lgy.cn.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,String> map = new HashMap<String,String>();
		List<String> list = new ArrayList<String>();
		for(int i = 0;i<40000;i++){
			list.add("key"+i);
			list.add("value"+i);
		}
		
		final Runtime rt = Runtime.getRuntime();
		
		rt.addShutdownHook(new Thread(){
			
			public void run(){
				StringBuffer sb = new StringBuffer();
				
				long heapMaxsize = rt.maxMemory() >> 20;
				sb.append("�������ڴ�:"+heapMaxsize+"M\n");
				
				long total = rt.totalMemory() >> 20;
				
				sb.append("���ڴ��С��"+total + "M\n");
				
				long free = rt.freeMemory() >> 20;
				
				sb.append("�����ڴ�:"+free +"M");
				
				System.out.println(sb);
			}
			
		});
		
	
	
	}

}
