package ch04;

public class Ex11_1 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i = 1; i < 21; i++)
		{
			if (i%3!=0)
			{
				continue;
			}
			else
			{
				if(i>3)
				{
					System.out.print("+ ");
				}
			}
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.print(" = " + sum);
	}
}