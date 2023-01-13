package ch11;

import java.util.Arrays;
import java.util.Iterator;

public class String_Ex3 
{
	public static void main(String[] args) 
	{
		String str = "전지현이가 백화점에서 팬사인회를 연다."
				 + "전지현은 5일 오후 3시 서울 소공동 롯데 백화점"
				 + " 8층 이벤트홀에서... 구두 브랜드 조이제화의" 
				 + " 홍보를 위한 팬사인회에 참석한다.";
		
		int len = str.length();
		System.out.println("len ="+len);

		/*1번.순방향으로 공백문자의 index번호를 출력하시오.
		5, 11,......87, : hint : indexOf을 사용한다.
		풀이:indexOf(str)을 하면 처음에는 5가 리턴, 그후에는 그 뒤부터 검사해서 값을 리턴받아야함*/
		//1.indexOf 이용
		int idx = -1;
		
		System.out.print("1번_1:");
		do {
			idx=str.indexOf(' ', idx+1);
			if(idx>=0)System.out.print(idx + ",");
		} while (idx>=0);
		System.out.println();
		
		
		//2.for
		System.out.print("1번_2:");
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				System.out.print(i + ",");
		}
		System.out.println();
		
		/*2번.역방향으로 공백문자의 index번호를 출력하시오.
		87, 81, 78,....5,  : hint : lastIndexOf을 사용한다.*/
		
		idx = len;
		System.out.print("2번_1:");
		do {
			idx = str.lastIndexOf(' ', idx-1);
			if(idx>=0) System.out.print(idx + ",");
		} while (idx>=0);
		System.out.println();
		
		System.out.print("2번_2:");
		for (int i = len-1; i >=0; i--) {
			if(str.charAt(i)==' ')
				System.out.print(i + ",");
		}
		System.out.println();
		
		/*3번.빈칸을 '_' 출력하시오. hint:charAt*/
		System.out.print("3번:");
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
			{
				System.out.print('_');
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
		
		/*4번 첫단어 출력하기 : substring, indexOf*/
		int a = str.indexOf(' ');
		String str2 = str.substring(0, a);
		System.out.println();
		System.out.println("4번:" + str2);
		
		/*5번 마지막단어 출력하기 : substring, lastIndexOf*/
		int b = str.lastIndexOf(' ')+1;
		String str3 = str.substring(b, len);
		System.out.println("5번:"+str3);
	}
}