package ch14;

import java.io.OutputStream;

public class OutputStream_Ex1 {

	public static void main(String[] args) {
		int i = 'A';
		char c = 'b';
		char c1 = '공';
		
		try {
			OutputStream os = System.out;//콘솔창에 출력스트림을 빨대로 꽂음
			os.write(i);
			os.write(c);
			os.write(c1);
			os.flush(); //스트림에 남아있는 data를 비운다
			os.close(); //사용하지 않는 스트림은 반드시 닫아야함
		} 
		catch (Exception e) {}
				
		//System.out.println(i); //65
		
	}

}
