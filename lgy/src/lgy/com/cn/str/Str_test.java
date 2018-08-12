package lgy.com.cn.str;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String str = input.nextLine();
			//正则对象
			Pattern pattern = Pattern.compile("\\b\\w+\\b");
			//匹配器
			Matcher matcher = pattern.matcher(str);
			int wordsCount = 0;
			
			while(matcher.find()){
				wordsCount++;
			}
			System.out.println(str + " 单词数："+wordsCount);
		
			
		}
	}

}
