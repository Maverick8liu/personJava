package lgy.com.cn.szr;

public class One {
	
	public static void main(String[] args){
		kk(9);
		//System.out.println(kk(9));
	}
	
	public static int kk(int g){
		int p = 0;
		if(g == 0 || g == 1){
			return 3;
		}else{
			p = g - (kk(g-2));
		}
		System.out.println(p);
		return p;
	}
	
}
