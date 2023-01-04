package ch04;

import java.util.Scanner;

public class Ex1 
{
	public static void main(String[] args) 
	{
		/*제어문: 조건(선택)문, 반복문
		 *-조건문: if-else(99.9프로 사용), switch(거의 안씀)
		 *-반복문:for(99프로 사용), while(1프로 사용)*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("입력한 숫자 : "+ a);
		
		if(a%3==0) //값이 ()안의 조건이면 {}안의 문장 실행
		{
			System.out.println("3의 배수입니다.");
		}
		else //if가 true가 아니면 실행. else는 내용이 있을수도 없을수도 있음
		{
			System.out.println("3의 배수가 아닙니다.");
		}
	}
}