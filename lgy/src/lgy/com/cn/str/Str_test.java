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
			//�������
			Pattern pattern = Pattern.compile("\\b\\w+\\b");
			//ƥ����
			Matcher matcher = pattern.matcher(str);
			int wordsCount = 0;
			
			while(matcher.find()){
				wordsCount++;
			}
			System.out.println(str + " ��������"+wordsCount);
		
			
		}
	}

}
