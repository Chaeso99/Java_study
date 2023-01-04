package ch06;

class Constructor1
{
	//생성자 정의
	public Constructor1() 
	{
		//기본 생성자:컴파일 시점에 JVM에 제공
	}
}

public class ConstructorEx1 
{
	public static void main(String[] args) 
	{
		Constructor1 c1 = new Constructor1();
		String s = new String();
	}
}