package ch06;

class Method1
{
	int abs(int num) //절댓값 계산 메서드
	{
		if(num<0)
			num = -num;
		return num;
	}
	
	void prn(int a, int b)
	{
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}
	
	//클래스를 만든 것. 사용하려면 메인에서 객체를 만들어야함
}

public class MethodEx1 
{
	public static void main(String[] args) 
	{
		Method1 m = new Method1();
		m.abs(-10); //return형이 있는 메서드라도 값을 반드시 int a=m.abs(-10) 처럼 받을 필요는 없다
		int a = m.abs(-22);
		System.out.println(a);
		m.prn(10, 20);
	}
}
