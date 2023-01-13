package ch10;

public class Exception_Ex7
{
	int a = 100;
	
	public void m(int b) throws Exception
	{
		if(b==0)
		{
			throw new Exception("a는 0으로 나누면 안됩니다!");
		}
		else
		{
			System.out.println(a + "/"+ b + " = " + (a/b));
		}
	}
	
	public static void main(String[] args) 
	{
		Exception_Ex7 et = new Exception_Ex7(); //Exception 객체 et 생성
		try 
		{
			et.m(10);
			et.m(0);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}