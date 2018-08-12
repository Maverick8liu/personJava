package lgy.com.cn.str;

import java.io.UnsupportedEncodingException;

public class Str_test2_utf {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String str = "»Ø»ð";
		
		byte[] b = str.getBytes("GB2312");
		
		System.out.println(new String(b));
	}
}
