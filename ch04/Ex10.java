package ch04;

import java.util.Iterator;

public class Ex10 
{
	public static void main(String[] args) 
	{
		//break는 반복문에서는 중간에 종료되는 기능
		int a = 0;
		while(true)
		{
			if(a == 10)
				break;
			System.out.println("a : " + a);
			a++;
		}//--while
		
		//문제:for문을 이용하여 1에서 n까지의 합이 100을 넘으면 그 합을 리턴하시오
		int sum = 0;
		
		for(int i = 0; true; i++)
		{
			if (sum>100)
			{
				break;
			}
				System.out.print(i+"\t");
				sum=sum+i;
		}
		System.out.println("\nsum : " + sum);
		
		for (int i = 0; i < 2; i ++) //i가 가질수 있는 값:0, 1
		{
			for (int j = 0; j<3; j++) //j가 가질수 있는 값:0, 1, 2
			{
				System.out.println(i+"+"+j+"="+(i+j));
			}//안쪽 for문
			System.out.println();
		}//바깥쪽 for문
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if(i+j>10)
				{
					break; //안쪽의 for문에 대한 break임
				}
			}//안쪽 for문
		}//바깥쪽 for문
		
		iot://구역의 시작 위치 - 라벨값 이라고 부름
			for (int i = 0; i < 5; i++)
			{
				for (int j = 0; j < 10; j++)
				{
					if(i+j>10)
					{
						break iot;// iot 라벨을 빠져나가야 하므로 바깥쪽 for문까지 빠져나감
					}
				}//안쪽 for문
			}//바깥쪽 for문
		
		//문제: 중첩 for문을 이용해서 i와 j의 합이 30이 넘어가면 빠져나오시오
		iot2:
		for(int i = 0; true; i++)
		{
			for(int j = 0; true; j++)
			{
				System.out.println("i+j= "+ i + j);
				if (i+j>30)
				{
					break iot2;
				}
			}
		}
	}
}