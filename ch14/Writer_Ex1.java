package ch14;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Writer_Ex1 {
	public static void main(String[] args) {
		int i = 'A';
		char c = 'b';
		char c1 = '공';
		try {
			OutputStream os = System.out;
			Writer writer = new OutputStreamWriter(os);

			writer.write(i);
			writer.write(c);
			writer.write(c1);
			writer.flush();
			os.close();
		} catch (Exception e) {}
	}
}