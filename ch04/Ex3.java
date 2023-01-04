package ch04;

import java.util.Scanner;

public class Ex3 
{
	public static void main(String[] args) 
	{
		//입력한 1~20사이의 숫자중에 3, 6, 9가 들어가는 숫자인지 판단하세요.(3, 6, 9 게임)-내 코드
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		
		if (a<1||a>20)
		{
			System.out.println("1~20 사이의 값을 입력하세요");
		}
		else if(a%10 == 3|| a%10 == 6||a %10 ==9)
		{
			System.out.println("짝");
		}
		else
		{
			System.out.println(a);
		}
	}
}