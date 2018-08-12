package lgy.com.cn.str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nanotime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10000;
		
		List<String> list = new ArrayList<String>(size);
		
		for(int i = 0;i<size;i++){
			list.add("value" + i);
		}
		
		long start = System.nanoTime();
		
		list.contains("value"+(size-1));
		long end = System.nanoTime();
		
		System.out.println("list excute time "+ (end -start));
		
		Map<String,String> map = new HashMap<String,String>(size);
		for(int i = 0;i<size;i++){
			map.put("key"+i, "value"+i);
		}
		
		
		start = System.nanoTime();
		
		map.containsKey("key"+(size - 1));
		
		end = System.nanoTime();
		
		System.out.println("map execute time "+(end - start));
		
		
	}

}
