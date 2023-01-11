package ch07;

import java.util.Iterator;

class Animal
{
	void move()
	{
		System.out.println("동물아 움직여라~");
	}
}

class Bird extends Animal
{
	String name = "새";
	@Override
	void move() 
	{
		System.out.println(name + "날아라~");
	}
}

class Fish extends Animal
{
	String name = "물고기";
	@Override
	void move() {
		System.out.println(name + "헤엄쳐~");
	}
}

class Cheetah extends Animal
{
	String name = "치타";
	@Override
	void move() {
		System.out.println(name + "달려라~");
	}
}

public class Casting_Ex3 
{
	public static void main(String[] args) 
	{
		Animal ani[] = new Animal[3]; //Animal 타입의 객체를 저장하는 배열 ani 선언, 3칸임
		ani[0] = new Bird();
		ani[1] = new Fish();
		ani[2] = new Cheetah();
		
		for (int i = 0; i < ani.length; i++) 
		{
			ani[i].move();
		}//동적바인딩: 하위클래스의 메서드를 호출
	}
}