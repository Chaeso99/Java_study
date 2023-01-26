package ch14;

import java.io.FileWriter;

public class FileWriter_Ex1 {

	public static void main(String[] args) {
		String str = "첫번째줄 입니다, \n"
				+"두번째줄 입니다, \n"
				+"세번째줄 입니다.";
		try {
			char intxt[] = new char[str.length()];
			str.getChars(0, str.length(), intxt, 0);
//			for (int i = 0; i < intxt.length; i++) {
//				System.out.print(intxt[i]);
//			}
			//FileWriter 객체 생성시 파일이 만들어진다.
			FileWriter fw = new FileWriter("ch14/bbb.txt");
			fw.write(intxt);
			fw.flush();
			fw.close();
			System.out.println("End");
		} catch (Exception e) {e.printStackTrace();}
	}

}
