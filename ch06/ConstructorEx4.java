package ch06;

class SuperClass4
{
//	public SuperClass4() 
//	{
//		
//	}
	public SuperClass4(int i) 
	{
		
	}
}

class SubClass4 extends SuperClass4
{
	public SubClass4() //부모클래스의 디폴트생성자가 없어서 에러남. int형 들어간 super생성자를 만들거나 부모클래스에 디폴트생성자 만들어야함 
	{
		super(22);
	}
}

public class ConstructorEx4 
{
	public static void main(String[] args) 
	{
		
	}
}