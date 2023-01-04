package ch06;

import java.util.Iterator;

class Method2
{
	/*메서드 오버로딩(Overloading) 기능은 동일함.
	동일한 메서드명으로 매개변수의 개수와 타입을다르게 선언.
	*/
	
	void prn(int a)
	{
		System.out.println(a);
		return;
	}
	
	void prn(int a, int b, int c)

	{
		System.out.println(a + "\t" + b + "\t" + c);
	}
	
	void prn(int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+ "\t");
		}
	}
}
public class MethodEx2 
{
	public static void main(String[] args)
	{
		//Math 클래스에 abs 메소드는 절대값 리턴
		int a = Math.abs(-10);
		double d = Math.abs(3.14);
		//정수, 실수 모두 절댓값을 뽑아내야 하는데 abs 메소드 하나만 알면 매개변수를 타입 관계없이 넣어도 되니까 편하다.(메소드 오버로딩)
		//함수의 기능이 같으면 같은 이름으로, 여러 매개변수 들어갈 수 있게 만들면 됨
		Method2 mt= new Method2();
		mt.prn(10);
		//mt.prn(12,13);
		mt.prn(12,13,14);
	}
}