package ch05;

public class Ex2 
{
	public static void main(String[] args) 
	{
		//다차원 배열 
		int arr[][] = new int [2][3]; //1차배열이 2칸, 배열안에 배열이 들어감
		//2차배열이라서 for문이 2개 들어가야함
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = i + j;
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}//--안쪽for문
		}//--바깥쪽for문
		
		//문제 1. arr2의 모든 값의 합을 구하시오.
		int sum = 0;
		
		int arr2[][] = {{1, 2},
				{3, 4, 5},
				{6},
				{1, 2, 3, 4},
				{2, 3, 4}};
		for (int i = 0; i < arr2.length; i++) 
		{
			for (int j = 0; j < arr2[i].length; j++) 
			{
				sum = sum + arr2[i][j];
			}
		}
		System.out.println("sum: " + sum);
		
		//문제 2. arr3의 평균을 구하시오.
		double average = 0;
		int count = 0;
		
		double arr3[][] = {{1.0},
	               {2.3,3.4},
	               {4.5,6.2,4.3},
	                {9.0}};
		for (int i = 0; i < arr3.length; i++) 
		{
			for (int j = 0; j < arr3[i].length; j++) 
			{
				average = average + arr3[i][j];
				count++;
			}
		}
		average = average/count;
		System.out.println("평균: " + average);
		average = Math.floor(average);
		System.out.println("평균 소수점 버림: " + average);
		
	} //main
}