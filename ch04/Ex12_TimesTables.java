package ch04;

public class Ex12_TimesTables 
{
	public static void main(String[] args) //구구단 가로정렬
	{
		for(int i =1; i < 10; i++)
		{
			System.out.print("\n"+ i + "단: ");
			for(int j=1; j<10; j++)
			{
				System.out.print(i +" x " + j + " =  " + (i*j));
				System.out.print("\t");
			}
		}
	}//--main
}//--class