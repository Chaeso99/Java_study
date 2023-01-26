package ch14;

import java.io.FileReader;

//파일을읽어옴
public class FileReader_Ex1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch14/aaa.txt");
			int a;
			while((a=fr.read())!=-1) //파일의 마지막 글자가 -1임
			{
				System.out.print((char)a);
			}fr.close();
			System.out.println("End");
		} catch (Exception e) {e.printStackTrace();}
	}
}