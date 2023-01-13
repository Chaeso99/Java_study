package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_Ex5 {

	public static void main(String[] args) {
		try {
			FileReader fr = myRead("aaa.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //myRead는 에러가 날 가능성이 있다는 선언, try catch를 해줘야함(사용시점에)
		
	}

	public static FileReader myRead(String name) throws FileNotFoundException
	//throws:이 메소드를 호출한곳에 예외가 일어난것을 던지겠다.
	{
		FileReader fr = new FileReader(name);
		return fr;
	}
}
