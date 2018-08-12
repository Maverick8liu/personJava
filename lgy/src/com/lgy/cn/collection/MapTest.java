package com.lgy.cn.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
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
		
		for(int i = 0;i<5093217;i++){
			map.put("key"+i, "value"+i);
		}
		
	}

}
