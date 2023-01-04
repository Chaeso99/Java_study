package ch06;

//클래스 선언 -> 필드&메서드 선언->객체 생성(new 연산자를 통해서 만듬, 필드 및 메서드 사용목적)
class Car2
{
	String name;
	int speed;
	int gear;
	
	void stop()
	{
		speed= 0;
	}
}

public class CarEx2 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 30; i++) {
			Car2 c1 = new Car2();
			//System.out.println(c1.toString());
		}
		
		//요청값 소문자를 대문자로 변경해서 출력하기
		String s = new String("dkaneofh");
		System.out.println(s.toUpperCase());
		
		//32라는 10진수를 2진수로 출력하세요.
		String binnum= Integer.toBinaryString(32);
		System.out.println(binnum);
		
		//Integer i = new Integer(32);
		//String s = i.toBinaryString(32);
		//System.out.println(s);
	}
}