package ch07;

class Car1 //2대 클래스
{
	int velocity;
	
	void speedUp()
	{
		velocity++;
	}
	
	void speedDown()
	{
		velocity--;
		if(velocity < 0)
		{
			velocity =0;
		}
	}
	
	void stop()
	{
		velocity = 0;
	}
}

class Taxi1 extends Car1
{
	@Override // Java의 Annotation(Java5.0부터 추가됨)
	void speedUp()
	{
		velocity +=5;
	}
}

class Bus1 extends Car1
{
	@Override // 선택사항이지만 안적어주면 실행하기 전에는 오버로딩한 메소드인지 확인을 못하므로 붙여주는게 좋다.
	void speedUp()
	{
		super.speedUp(); //부모 메소드 호출
		if(velocity>100)
		{
			velocity = 100;
		}
	}
}

public class Inheritance_Ex1 
{

	public static void main(String[] args) 
	{
		Taxi1 t = new Taxi1();
		t.speedUp();
		System.out.println(t.velocity); //5
		
		Bus1 b = new Bus1();
		b.velocity = 110;
		b.speedUp();
		System.out.println(b.velocity); //100
	}
}