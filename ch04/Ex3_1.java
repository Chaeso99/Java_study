package ch04;

import java.util.Scanner;

public class Ex3_1 
{
	public static void main(String[] args) 
	{
		//입력한 1~20사이의 숫자중에 3, 6, 9가 들어가는 숫자인지 판단하세요.(3, 6, 9 게임)-강사님 풀이
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요.");
				int a = sc.nextInt();
				int b = a%10; //십의 자리 날아가고 일의 자리만 리턴
				
				//if(b==3||b==6||b==9)
				if(b!=0&&b%3==0)
				{
					System.out.println("짝");
				}
				else
				{
					System.out.println(a);
				}				
	}
}