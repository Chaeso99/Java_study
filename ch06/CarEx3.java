package ch06;

class Car3
{
	String carName;
	int velocity;
	String carColor;
	
	void speedUp()
	{
		velocity++;
	}
	
	void speedDown()
	{
		velocity--;
		if(velocity<0)
		{
			velocity = 0;
		}
	}
}

public class CarEx3 
{
	public static void main(String[] args) 
	{
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		c1.carName="아반테";
		c2.carName="소나타";
		
		System.out.println("c1: "+ c1.carName);
		System.out.println("c2: "+ c2.carName);
		
		c2 = c1;
		System.out.println("c1: " + c1.carName);
		System.out.println("c2: " + c2.carName);
		
		c1.carName = "그랜저";
		System.out.println("c1: " + c1.carName);
		System.out.println("c2: " + c2.carName);
		
		//System.out.println(c1.toString()); //6f2...
		//System.out.println(c2.toString());//529...
		
		//c2 = c1; //이 둘은 참조형 타입의 변수. c1이 가리키고 있는 객체의 주소값(6f2..)을 c2로 복사하므로 c1,c2가 같은 객체를 가리킴
		//call by reference 방식이다.
		//5e9...객체는 사용할 방법이 없어 필요없어지므로 JVM이 가비지컬렉션(메모리상에서 삭제) 해버린다. 바로 삭제되지는 않고 호출되거나 안바쁠때 삭제 
		//C++까지의 자바 이전 언어에서는 필요없는 데이터들을 일일히 삭제해줘야 했다
		
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		
		int a = 10;
		int b = a; //자바기본형: call by value 방식 - 값을 복사
		a = 15;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}