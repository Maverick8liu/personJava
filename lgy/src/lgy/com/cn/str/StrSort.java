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
		//String[] strs = {"����(Z)","����(L)","����(W)"};
		String[] strs = {"��(B)","��(X)"};
		Comparator c = Collator.getInstance(Locale.CHINA);
		
		Arrays.sort(strs,c);
		
		int i = 0;
		for(String str:strs){
			System.out.println((++i) + "��" + str);
		}
	}

}
