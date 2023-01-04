package ch04;

public class Ex8 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int jjaksu = 0;
		int holsu = 0;
		int tsn = 0;
		
		//문제 1. 1~30사이의 값중에 3의 배수의 합을 구하시오.
		for(int i=0; i<31; i++)
		{
			if (i%3==0)
			{
				sum = sum+i;
				System.out.println("sum: "+ sum);
			}
		}
		
		//문제 2. 1~30사이의 값중에 짝수와 홀수의 합을 각각 구하시오.
		for(int j = 0; j<31; j++)
		{
			if(j%2==1)
			{
				holsu = holsu + j;
				System.out.println("holsu: "+ holsu);
			}
			else
			{
				jjaksu = jjaksu + j;
				System.out.println("jjaksu: " + jjaksu);
			}
		}
		
		//문제3. 1~50사이의 3,6,9의 합은? 힌트-%와 /를 사용, 33/10=>3 sum:627*/
		for(int k = 0; k<51; k++)
		{
			while(k>0) 
			{
				if (k%10==3||k%10==6||k%10==9)
				{
					tsn = tsn + k;
					k=k/10;
					System.out.println("tsn: "+ tsn);
				}
			}
		}
	}
}
