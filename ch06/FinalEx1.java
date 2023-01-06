package ch06;

//final(마지막):클래스, 필드(인스턴스 변수), 메서드 앞에 오는 제어자
//1. 클래스: sub 클래스가 없는 클래스
//2. 변수:상수(한번 정하면 변하지 않는 값) 선언(필드, 매개변수, 지역변수)
//3, 메서드:오버라이딩 불가능. 오버라이딩은 상위 클래스에서 정의한 메소드를 하위 클래스에서 재정의하는 것.

final class Final1
{
	
}

//class Final2 extends Final1
//{
//	
//}

class Final3
{
	final int KIA = 1;
	final int SK = 2;
	int k; 	
	
	public Final3() 
	{
		//KIA = 2;
		System.out.println(k); //필드에 선언한 변수는 자동으로 초기화되므로 k=0
	}

	public void prn(final int a)
	{
		//a = 10;
		final int b = 10; //지역변수(local variable)
		//b = 20;
		int c;
		// System.out.println(c); //윗줄에서 에러가 안나고 여기서 나는 이유:변수 선언과 초기화는 한번에 적을수도 있지만, 원래 두 단계 라서
		//선언 자체로는 에러가 안나고 초기화 없이 사용할 때 에러가 남
	}
}

	class Final4
	{
		void prn1() {}
		final void prn2() {}
	}
	
	class Final5 extends Final4
	{
		@Override
		void prn1() {}
		
		//@Override
		//void prn2() {}
	}
	
public class FinalEx1 
{
	public static void main(String[] args) 
	{
		
	}
}