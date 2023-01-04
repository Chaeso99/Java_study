package ch03;

public class Ex3 
{
	//java Ex3 하하 히히 호호
	public static void main(String[] args) 
	{
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		//배열: 동일한 data type을 하나의 변수로 묶어놓은 기능, 대괄호로 표시함 배열밑에는 항상 for문이 있다.
		//크기가 정해져 있는 반복은 for문, 크기가 정해져 있지 않은 반복은 while문 사용
		for (int i = 0;  i< args.length; i++) //length는 3이니까 i가 0부터 시작해서 2일때까지 3번돌아감
		{
			System.out.println(args[i]);
		}
		
		int a = 1;
		int b = 2;
		int c = 3;
		//단독주택
		
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		//아파트(주소는 같은데 동,호 수만 다름)
	}
}