package ch11;
//char(캐릭터) 클래스

public class Wrapper_Ex2 
{
	public static void main(String[] args) 
	{
		char c1 = 'J';
		System.out.println(c1);
		if(Character.isLetter(c1))//문자면
			{System.out.println(" : 문자입니다.");}
		
		char c2 = 'a';  //대문자인지 소문자인지?
		if(Character.isLowerCase(c2))
		{
			System.out.println(" : 소문자입니다.");
		}
		else
		{
			System.out.println(" : 대문자입니다.");
		}
		char c3 = '2'; //숫자인지?
		if(Character.isDigit(c3))
		{
			System.out.println(" : 숫자입니다.");
		}
		char c4 = ' '; //공백문자인지?
		if(Character.isWhitespace(c4))
		{
			System.out.println(" : 공백입니다.");
		}
		
		Long l;
		Boolean b;
		Short s;
		Double d;
		Float f;
		Byte bt;
		Integer i;
		Character c;
		//Integer와 Character, String을 가장 많이 사용
	}
}