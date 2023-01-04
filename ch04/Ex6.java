package ch04;

import java.util.Scanner;

public class Ex6 
{
	public static void main(String[] args) 
	{
		//점수와 학년을 입력받아 60점 이상이면 합격, 4학년은  70점이상이면 합격
		//힌트:중첩 if문 사용
		// 내 코드
		Scanner sc = new Scanner(System.in);
		int score, year;
		System.out.print("점수를입력하세요.(0~100): ");
		score = sc.nextInt();
		System.out.print("학년을입력하세요.(1~4): ");
		year = sc.nextInt();
		
		if (year<1 || year>4 || score<0 || score>100)
		{
			System.out.println("값을 다시 입력하세요.");
		}
		else if (year<4)
		{
			if(score>=60)
			{
				System.out.println("합격하셨습니다!");
			}
			else
			{
				System.out.println("불합격하셨습니다.");
			}
		}
		else if(year==4)
		{
			if(score>=70)
			{
				System.out.println("합격하셨습니다!");
			}
			else
			{
				System.out.println("불합격하셨습니다.");
			}
		}
	}
}