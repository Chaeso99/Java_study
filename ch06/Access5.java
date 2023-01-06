package ch06;

import java.awt.Frame;
//문제. java.awt.Frame에 paramString의 결과값을 출력하시오

class Access5F extends Frame
{
	public Access5F() 
	{
		System.out.println(paramString());
	}
}

public class Access5
{
	public static void main(String[] args) 
	{
		Access5F a5=new Access5F();
	}
}