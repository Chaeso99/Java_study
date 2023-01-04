package ch03;

public class Ex2 
{
	
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 1;
		int a1 = a++; //a를 먼저 넘겨주고 1을 증가시킨다
		int b1 = ++b; //b를 1 증가시키고 넘겨준다
		
		//a랑 b는 둘다 2임
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("a1: " + a1);
		System.out.println("b1: " + b1);
	}

}
