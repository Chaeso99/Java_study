package ch11;

import java.util.Vector;

//자바의 기본형 Data Type 8가지를 객체화 시킨것이 Wrapper class

public class Wrapper_Ex1 
{
	public static void main(String[] args) 
	{
		int a = 10;
		Integer it1 = a; //원래는 변하면 안됨 자바5.0에서 오토박싱이라는 이름의 자동변경기능이 생김
		System.out.println("it1="+it1);
		int b = it1;//오토 언박싱
		System.out.println("b="+b);

		Vector v = new Vector<>();
		v.add(a); //Auto Boxing
		v.add(it1);
		int c = (Integer)v.get(0);//Auto unBoxing
		
		//아래둘다 권장하지 않는 방법.
		Integer it2 = new Integer(10);
		Integer it3 = new Integer("20");
		
		//권장 방법
		Integer it4 = Integer.valueOf(10);
		Integer it5 = Integer.valueOf("20");
		
		//둘다 가능
		int a1 = it4.intValue();
		a1 = it4; //일반적으로 이렇게 씀
		int b1 = it5.intValue();
		int c1 = a1+b1;
		System.out.println("c1:"+c1);
		
		int a2 = Integer.parseInt("30");
		System.out.println("Binary a2 =" + Integer.toBinaryString(a2));
	}
}