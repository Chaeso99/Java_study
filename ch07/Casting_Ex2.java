package ch07;

import java.util.Vector;

class Person2
{
	String name;
	public Person2(String name) 
	{
		this.name = name;
	}
}

class Student2 extends Person2
{
	String grade;
	public Student2(String name) 
	{
		super(name);
	}
}

public class Casting_Ex2 
{
	public static void main(String[] args) 
	{
		Person2 p;
		Student2 s = new Student2("홍길동");
		p = s; //업 캐스팅 발생, s랑 p 둘다 같은객체의 메모리를 가리킴
		//p. 메소드는 불가능, s. 메소드는 가능
		System.out.println(p.name); //이름은 Person2클래스에 있는 필드라서 가능
		//System.out.println(p.grade); //grade는 불가능
		
		Student2 s2;
		Person2 p2 = new Person2("청길동");
		//s2 = p2; //하위객체 s2가 기능이 더 많으므로 상위객체 p2를 집어넣는건 불가능
		//s2 = (Student2)p2; //다운캐스팅(컴파일은 되나 실행할때 오류 발생)
		//s2.grade = "A";
		//System.out.println(s2.grade);
		
		Vector v = new Vector();
		String str = new String();
		Student2 s3 = new Student2("장동건");
		v.add(str);
		v.add(s3);
		String str1 = (String)v.get(0);
		Student2 s4 = (Student2)v.get(1);
	}
}