package ch06;

class SuperClass3
{
	public SuperClass3() 
	{
		System.out.println("Super 생성자");
	}
}

class SubClass3 extends SuperClass3
{
	public SubClass3() 
	{
		super();//생략:반드시 생성자의 첫번째 라인에 와야함.
		System.out.println("Sub 생성자");
	}
}

public class ConstructorEx3 
{
	public static void main(String[] args) 
	{
		SubClass3 s1 = new SubClass3();
		//SubClass3 객체 생성->super();를 만나 SuperClass3으로 감->super();를 만나 Object로 감->
		//Object 객체 생성->SuperClass3객체 생성->Subclass3 객체 생성
		//세 클래스 안의 모든 메서드가 실행된다
	}
}