package ch04;

public class Ex11 
{
	public static void main(String[] args) 
	{
		//1~10사이의 짝수를 출력하시오
		for(int i = 0; i < 11; i++)
		{
			if (i%2==0)
			{
			System.out.print(i + "\t");
			}
		}//--for문
		System.out.println("\n-------------------------------------------");
		for(int i = 0; i < 11; i++)
		{
			if(i%2!=0)
			{
				continue;//for문으로 가라(밑에 코드 실행 안됨.)
			}
			System.out.print(i + "\t");
		}
		
		System.out.println();
		//문제: 1~20사이 3의 배수의 합을 구하시오(식도 같이, continue 사용)
		//3 + 6 + 9 + 12 + 15 + 18 = OOO
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i < 21; i++)
		{
			if(i%3!=0)
			{
				sum = sum + i;
				continue;
			}
			else if(count ==0 && i%3==0)
			{
				System.out.print(i);
				count ++;
			}
			else
			{
				System.out.print(" + " + i);
			}
		}
		System.out.print(" = "+ sum);
	}
}