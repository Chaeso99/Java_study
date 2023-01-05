package ch06;

class Constructor5
{
	int a;
	String str;
	
	public Constructor5() 
	{
		//중복된 기능
	}
	public Constructor5(int i) 
	{
		a = i;
		//중복된 기능
	}
	public Constructor5(String s) 
	{
		str = s;
		//중복된 기능
	}
	//중복된 기능이 여러번 들어가서 비효율적임
}

class Constructor5_1
{
	int a;
	String str;
	
	public Constructor5_1() 
	{
		//중복된 기능
	}
	public Constructor5_1(int i) 
	{
		this(); //자신의 디폴트 생성자 호출. 반드시 생성자 첫번째 라인에 와야함. 즉 super()와 같이 사용 불가능
		a = i;
	}
	public Constructor5_1(String s) 
	{
		this();
		str = s;
	}
}

public class ConstructorEx5 
{
	public static void main(String[] args) 
	{

	}
}