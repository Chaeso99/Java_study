package ch10;
//예외처리
public class Exception_Ex1 
{
	public static void main(String[] args) 
	{
		try //예외가 일어날 가능성이 있는 코드들 들어감
		{
			int a = 10;
			int b = 0;
			System.out.println("a + b: " + (a+b));
			System.out.println("a - b: " + (a-b));
			System.out.println("a * b: " + (a*b));
			//System.out.println("a / b: " + (a/b));
		} 
		catch (Exception e) //예외가 일어나면 실행되는 영역
		{
			System.err.println("0으로 나눌수 없습니다."); //오류 내용 표기
			//System.err.println(e.getMessage());
		}
	System.out.println("성공");
	}
}