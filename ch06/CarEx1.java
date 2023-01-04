package ch06;

//클래스 선언-클래스의 원래 풀네임:ch06.Car1
//클래스:객체를 만드는 틀(붕어빵 틀)
class Car1 //클래스명
{
	//필드: 객체의 속성 <-절대 () 없다.
	String carName;
	int velocity;
	String carColor;
	
	//메서드: 객체의 기능 <- 반드시 ()가 있다. - 이름은 주로 카멜 표기법 형식으로 적음
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
	
	void stop()
	{
		velocity = 0;
	}
	
} //--class

//.java로 선언된 클래스만 public 사용가능
public class CarEx1 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[3];
		System.out.println(arr.length);
		String str = "오늘의 메뉴는 수구레";
		System.out.println(str.length());
		
		//객체 생성 - Car1객체를 만들건데 이름은 c1임 new<-객체를 생성시켜주는 키워드
		//JVM이 Car1이라는 클래스까지 찾아가서 클래스가 있으면 에러 안나고 클래스를 가져와서 객체 c1을 만듬(메모리에)
		//c1은 객체를 가리키는 이름
		//메모리안의 객체에는 3개의 필드(이름, 색, 속도)와 3개의 메서드(속도업, 속도다운, 정지)가 있음.
		
		Car1 c1 = new Car1();
		c1.carName= "소나타";
		c1.carColor= "은색";
		c1.speedUp();
		
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
	}
}