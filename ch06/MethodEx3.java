package ch06;

class Method3
{
	void prn(int...arr) //배열로 인식, 가변인수
	{
		for (int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}

public class MethodEx3 
{

	public static void main(String[] args) 
	{
		Method3 mt = new Method3();
		mt.prn(1);
		mt.prn(1,2);
		mt.prn(1,2,3,4);
		mt.prn(1,3,5,7,9);
		System.out.printf("%s", "하하"); //printf의 매개변수로 앞에는 string, 뒤에는 가변인수가 온다.
		//가변인수의 조건: 맨 마지막 자리에 들어가야함(자동으로 배열이 된다)
	}

}
