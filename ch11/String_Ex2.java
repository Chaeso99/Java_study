package ch11;

import java.util.Iterator;

public class String_Ex2 {
	public static void main(String[] args) {
		String str = "Java Programming";
		
		int len = str.length();
		System.out.println("len: "+len); //공백도 문자로 취급
		System.out.println(str.toLowerCase());//소문자로 변환
		System.out.println(str.toUpperCase());//대문자로 변환
		
		String str2 = str.substring(5); 
		String str3 = str.substring(5, 10); 
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		
		//8번째 문자
		char c1 = str.charAt(8);
		System.out.println("8번째 문자 하나: "+c1);
		//짝수자리 문자만 출력하시오
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0)
			{
				System.out.print(str.charAt(i));
			}
		}
		//a문자는 몇번째 자리에 있는가?
		//Java Programming
		int idx1 = str.indexOf('a');
		System.out.println("\n" + "idx1: "+idx1);
		int idx2 = str.lastIndexOf('a');
		System.out.println("idx2: "+idx2);
		//a를 q로 변환 출력하시오 : charAt, replace
		String strq = str.replace('a', 'q');
		System.out.println(strq);
		
		String strq2;
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)=='a')
			{
				System.out.print('q');
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		} //--for
		
		//charAt, ?을 이용해서 str을 반대로 출력하시오(gnimmargorP avaJ)
		StringBuffer strb = new StringBuffer(str);
		String rstr = strb.reverse().toString();
		System.out.println('\n'+rstr);
		
		char [] strArr = str.toCharArray(); //String을 char 배열로 변경
		char [] reverseArr = new char[strArr.length];
		for (int i = 0; i < str.length(); i++)
		{
			reverseArr[strArr.length-1-i] = strArr[i]; 
		}
		String reverseStr = new String (reverseArr); //char배열을 String으로 변경
		System.out.println(reverseStr);
		
		for (int i = len-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		String str5 = "Java&JSP&Android";
		String str6[] = str5.split("&");
		for (int i = 0; i < str6.length; i++) {
			System.out.println(str6[i]);
		}
		
		String str7 = "   JSPStudy  ";
		System.out.println("***"+str7.trim()+"***"); //좌우 공백 제거
		int idx3 = 22; 
		String str8 = String.valueOf(idx3);//정수를 문자로 변환
		String str9 = idx3+"";//정수를 문자로 변환-편법
		System.out.println(str8 + " : "+ str9);
	}
}
