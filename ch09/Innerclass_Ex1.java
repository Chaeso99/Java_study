package ch09;

/* 내부(중첩)클래스
 * 1.클래스 안에 선언(활용도 가장 높음) ★
 * 2.클래스 안에 선언이지만 static 클래스(활용도 거의 없음)
 * 3.메서드 안에 클래스 선언(활용도 낮음)
 * 4.익명 클래스(3번과 마찬가지로 메서드 안에 선언하지만 다름, 선언과 동시에 생성) (활용도 높음) ★
 * */

//바깥에 있으므로 독립적으로 클래스가 하나 생김
interface MyInter{
	void prn();
}

class Outer1{
	class Inner1{
		
	}//1.
	
	static class Inner2{
		
	}//정적(객체생성없이 바로 접근가능) 클래스 2.
	
	//메서드 안에 메서드는 선언 불가능, 메서드안에 클래스는 선언 가능
	void prn() {
		class Inner3{
			//3.메서드안에 선언한 클래스
		}
	
		new MyInter() {
			
			@Override
			public void prn() {
			}//4.익명클래스
		};
	}
}//--class Inner1(더부살이 클래스 <=내부 클래스 아님)

public class Innerclass_Ex1 
{
	public static void main(String[] args) 
	{

	}
}