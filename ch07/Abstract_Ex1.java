package ch07;

import java.awt.Component;

abstract class Abstract1 //추상클래스-추상메서드가 꼭 있어야하는건 아니다.
{
	abstract void prn();
	//추상메서드
}

class Normal1 extends Abstract1
{
	@Override
	void prn() {
	}
}

class MComponent extends Component
{
	
}

public class Abstract_Ex1 
{
	public static void main(String[] args) 
	{
		Abstract1 a;
		//a = new Abstract();
		a = new Normal1();
	}
}