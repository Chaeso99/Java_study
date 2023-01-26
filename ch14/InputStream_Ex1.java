package ch14;

import java.io.IOException;
import java.io.InputStream;

public class InputStream_Ex1 {

	public static void main(String[] args) {
		InputStream is = System.in;//키보드에 연결된 빨대
		while(true) {
			try {
				int a = is.read(); //내부적인 스레드:입력전 대기상태
				if(a==-1/*ctrl+z*/) break;
				System.out.print((char)a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
