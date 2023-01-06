package ch06;

import ch06_1.Access3;

class Access4 extends Access3
{
	public Access4()
	{
		int k = b + c;
	}
	//상속에서 public, protected 까지 유산임
	//private는 제외
}

public class AccessEx4 
{
	public static void main(String[] args) 
	{
		Access3 ac = new Access3();
	}
}