package ch03;

public class Ex5 
{

	public static void main(String[] args) 
	{
		//대입연산자
		int a = 10;
		int b = 5;
		a = a + 10;
		System.out.println(a);
		b+=10;//b = b+10
		System.out.println(b);
		a/=5; //a를 5로 나눈 몫
		System.out.println(a);
		b%=3;//b를 3으로 나눈 나머지
		System.out.println(b);
		
		//삼항연산자-코드를 심플하게 정리가능, 리턴값을 정할 수 있음
		int c = 10;
		String s = (c%2==0)?"짝수":"홀수";
		int d = (c>0)? c : -c; //절댓값 구하는 로직
		Math.abs(10);
	}

}
