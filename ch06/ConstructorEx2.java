package ch06;

import java.awt.Dialog;

class Constructor2
{
	//public Constructor2(int i){} 생성자가 정의되어 있으므로 디폴트 생성자를 JVM이 안만들어서(생성자가 하나라도 존재하면 안만듬)
	//12번 줄에서 에러가 남- 디폴트생성자를 정의하거나 매개변수 값을 넣어줘야함.
}

public class ConstructorEx2 
{
	public static void main(String[] args) 
	{
		Constructor2 c1 = new Constructor2();
		//JVM이 디폴트생성자를 컴파일시점에 제공해줘서 에러안남
		
		//Dialog d = new Dialog(); 
		//알림창이며 내 자신을 띄운 프레임 클래스가 매개변수로 들어가야함-디폴트 생성자가 없다.
	}
}
