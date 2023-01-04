package ch04;

import java.util.Scanner;

public class Ex6_1 
{

	public static void main(String[] args) 
	{
		//강사님 코드
		Scanner sc = new Scanner(System.in);
		int score, year;
		System.out.print("점수를입력하세요.(0~100): ");
		score = sc.nextInt();
		System.out.print("학년을입력하세요.(1~4): ");
		year = sc.nextInt();
		
		if(score>=60)
		{
			if(year!=4) //60점 이상이고 1~3학년
			{
				System.out.println("합격");
			}
			else if(score>=70) //점수가 70점 이상
			{
				System.out.println("합격");
			}
			else //70점 미만의 4학년
			{
				System.out.println("불합격");
			}
		}
		else //60점 미만
		{
			System.out.println("불합격");
		}
	}

}
