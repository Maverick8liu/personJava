package lgy.com.cn.str;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * @author Administrator
 *
 */
public class StrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] strs = {"张三(Z)","李四(L)","王五(W)"};
		String[] strs = {"犇(B)","鑫(X)"};
		Comparator c = Collator.getInstance(Locale.CHINA);
		
		Arrays.sort(strs,c);
		
		int i = 0;
		for(String str:strs){
			System.out.println((++i) + "、" + str);
		}
	}

}
