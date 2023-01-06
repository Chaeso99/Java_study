package ch06;

//static: 필드, 메서드, 클래스(일부) 앞에 붙을 수 있음
//static 필드 및 메서드는 객체를 생성하지 않아도 사용가능. 
//사용시점:클래스명으로 접근하기 때문에 그때 메모리에 로딩

class Static1
{
	static int i = 0;
	int j = 0;
	
	static void prn1() {}
	void prn2() {}
	static class Inner{} //내부클래스 앞에는 static 올 수 있음.
}

public class StaticEx1 
{
	public static void main(String[] args) 
	{
		int a = Math.abs(-6);
		int b = (int)Math.round(3.14); //round의 리턴 타입이 long형이라 int형보다 길어서 명시적 형 변환을 해줘야함
		
		Integer i = new Integer(22);
		int c = i.parseInt("23");
		//에러는 아님(경고) 쓸수는 있는데 이렇게 안쓰는게 좋다.
		
		int d = Integer.parseInt("23"); //이렇게 사용하는것이 일반적이다.
		
		//문제:반지름이 5인 원의 넓이를 구하시오.
		System.out.println(5*5*Math.PI);
	}
}