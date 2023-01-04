package ch04;

public class Ex12_TimesTables2 
{
	public static void main(String[] args) //구구단 세로정렬
	{
		System.out.print("      1단"+"\t\t      2단"+"\t\t     3단"+"\t\t      4단"
	+"\t\t     5단"+"\t\t      6단"+"\t\t     7단"+"\t\t      8단"+"\t\t     9단");
		
		for(int i =1; i < 10; i++)
		{
			System.out.print("\n");
			for(int j=1; j<10; j++)
			{
				System.out.print(j +" x " + i + " =  " + (i*j));
				System.out.print("\t");
			}
		}
	}//--main
}//--class