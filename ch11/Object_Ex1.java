package ch11;

//오브젝트는 기본적으로 9개의 메서드 존재

class Point{
	
}

public class Object_Ex1 
{
	public static void main(String[] args) 
	{
		Point p = new Point();
		System.out.println("클래스이름: "+p.getClass());
		System.out.println("해쉬코드: "+p.hashCode());
		System.out.println("객체문자열: "+p.toString()); //toString 생략가능
		
		Point p1 = new Point();
		System.out.println("클래스이름: "+p1.getClass());
		System.out.println("해쉬코드: "+p1.hashCode());
		System.out.println("객체문자열: "+p1.toString()); //toString 생략가능
		
		String s = new String("금요일");
		System.out.println("객체문자열: "+s.toString());
	}
}