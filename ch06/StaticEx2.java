package ch06;

public class StaticEx2 
{

	static int a = 10;
	int b = 10; //non-static
	
	static void prn1()
	{
		System.out.println(a);
		//System.out.println(b); 
		//static 메서드에는 non-static 사용 불가
	}
	
	 void prn2()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		StaticEx2 st = new StaticEx2();
		//객체생성해서는 static, non-static 둘다 사용가능
		st.prn1();
	}
}