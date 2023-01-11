package ch07;

class Car3
{
	public Car3() 
	{
		super();
	}
	
	void speedUp()
	{
		
	}
}

class Taxi3 extends Car3
{
	void stop()
	{
		
	}
}

public class Inheritance_Ex3 
{
	public static void main(String[] args) 
	{
		Object obj = new Car3(); 
		//메모리상에 Car3 객체가 만들어는 졌으나 얘를 가리키는 변수가 '오브젝트' 라면 가리킬수는 있으나(래퍼런스 할수는 있다)
		//obj.speedUp() //Car3이 가진 메소드는 object에게 없다(사용불가능)
		Car3 c = new Taxi3(); //상위클래스의 객체는 하위클래스를 래퍼런스 가능
		//Taxi3 t = new Car3(); //하위클래스의 객체는 상위클래스를 래퍼런스 불가능(미스매치)
	}
}
