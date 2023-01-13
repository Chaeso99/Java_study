package ch11;

class Point3{}

public class String_Ex1 
{
	public static void main(String[] args) 
	{
		Point3 p1 = new Point3();
		Point3 p2 = new Point3();
		System.out.println(p1==p2); //결과:false
		int a = 10;
		int b = 10;
		System.out.println(a==b); //true
		
		//new 연산자 없이 객체를 생성하는 유일한 클래스
		//new 없이 만들어진 String 객체는 String 저장소에 저장됨, 생성할때 동일한 문자열 값이 있으면 참조를 하게 된다(주소 같음)
		String s1 = new String("Java");
	    String s2 = new String("Java");
		String s3 = "Java"; //생성
		String s4 = "Java"; //재사용
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		
		//객체의 문자열 내용을 비교 (셋다 true)
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(p1.equals(s2));
		
		String s5 = "APPLE";
		String s6 = "apple";
		System.out.println(s5.equals(s6)); //false
		System.out.println(s5.equalsIgnoreCase(s6));//true
	}
}
