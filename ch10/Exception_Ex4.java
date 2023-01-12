package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Test.txt 파일을 읽어와서 출력시키는 예제
public class Exception_Ex4 
{
	public static void main(String[] args) 
	{
		try {
			FileReader fr = new FileReader("ch10/Test.txt"); //에러 해결법 두가지중 try/catch로 감싸기 선택
			//FileReader fr = new FileReader("ch10/Test1.txt"); //지정된 파일을 못찾는다는 에러메세지 나옴
			int a;
			while ((a=fr.read())!=-1) //add catch clause... 에러 해결법 4가지중 선택
			{
				System.out.print((char)a);
			}
			} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
