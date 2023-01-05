package ch06;

class Constructor1 extends Object //모든 클래스가 Object를 상속하지만 평소엔 extends Object 기입이 생략되어있음.
{
	//디폴트 생성자: 구현하지 않으면 JVM이 컴파일 시점에 제공해줌
	public Constructor1() 
	{
		System.out.println("생성자 호출");
	}
	
	public Constructor1(int i) 
	{
		System.out.println("int 생성자 호출");
	}
	
	public Constructor1(String s) 
	{
		System.out.println("String 생성자 호출");
	}
}

public class ConstructorEx1 
{
	public static void main(String[] args) 
	{
		//생성자가 많이 본재하는 이유:객체가 생성되는 다양한 케이스 때문임
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(22);
		Constructor1 c3 = new Constructor1("하하");
		
	}
}