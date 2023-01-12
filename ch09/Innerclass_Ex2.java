package ch09;

class Outer2
{
	int a = 22;
	
	void p()
	{
		System.out.println("a = "+ a);
		//System.out.println("a+b = " + (a+b));//외부클래스에서 내부클래스 변수b는 못씀
	}
	
	class Inner2
	{
		int b = 23;
		void p1() 
		{
			p();
			System.out.println("a+b = " + (a+b)); //문자+숫자는 문자로 변환됨. ()를 쳐줘야 a+b의 값(45)이 나옴, 내부클래스에서 외부클래스변수 a는 사용가능
		}
	}//--Inner2
}//--Outer1

public class Innerclass_Ex2 
{
	public static void main(String[] args) 
	{
		//일반적으로 내부클래스는 다른 클래스에서 생성하고 사용하는경우가 거의 없다.(가능은 함)
		
		//제3의 클래스에서 사용법
		Outer2 out = new Outer2();
		Outer2.Inner2 in = out.new Inner2();
		in.p1();
	}
}
