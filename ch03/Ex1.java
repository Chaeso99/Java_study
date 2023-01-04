package ch03;

import java.util.Scanner;

public class Ex1 
{
	public static void main (String[] args) 
	{
		int a = 10;
		int b = 3;
		int c = Math.max(a, b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//몫(정수)
		System.out.println(a%b);//나머지
		//입력한 값이 홀수인지 짝수인지 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int d = sc.nextInt();
		//System.out.println(d); //값을 리턴함(넘겨줌)
		if(d%2==0) 
		{
			System.out.println(d +"는 짝수입니다.");
		}
		else
		{
			System.out.println(d +"는 홀수입니다.");
		}
	}
}