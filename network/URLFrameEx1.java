package network;

//내가짠거
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;



public class URLFrameEx1 extends MFrame implements ActionListener {

	TextArea ta;
	TextField tf;
	Button connect;
	Button save;

	public URLFrameEx1() {
		super(500, 500);
		setTitle("ViewHost");
		
		Panel p = new Panel();
		p.add(tf = new TextField("http://", 40));
		p.add(connect = new Button("connect"));
		p.add(save = new Button("save"));
		
		ta = new TextArea();
		add(p, BorderLayout.NORTH);
		add(ta);
		
		save.setEnabled(false);
		connect.addActionListener(this);
		save.addActionListener(this);
		tf.addActionListener(this);
		
		validate();
	}

	@Override 
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String str = tf.getText();
		
				try {
					URL url = new URL(str);
				if(obj==connect||obj==tf) //connect 버튼 누르거나 엔터키 입력
				{
					BufferedReader br = new BufferedReader
							(new InputStreamReader(url.openStream(), "UTF-8"));
					String line = "";
					
					while (true) {
						line = br.readLine();
						if(line==null)
							break;
						ta.append(line);
					}	br.close();
					System.out.println("--Connect End--");
					save.setEnabled(true);
				}
				
				if(obj==save) //save버튼 누르면
				{
					String strSave = ta.getText();
					try 
					{
						char intxt[] = new char[str.length()];
						str.getChars(0, str.length(), intxt, 0);
//						for (int i = 0; i < intxt.length; i++) {
//							System.out.print(intxt[i]);
//						}
						//FileWriter 객체 생성시 파일이 만들어진다.
						FileWriter fw = new FileWriter(str+".txt");
						fw.write(intxt);
						fw.flush();
						fw.close();
						System.out.println("--Save End--");
					} 
					catch (Exception e3) 
					{
						System.out.println("--Save Fail--");
						e3.printStackTrace();
					}
				}
				
				} catch (Exception e2) {
					e2.printStackTrace();
					//System.out.println("저장 실패");
				}
	}

	
	public static void main(String[] args) {
		URLFrameEx1 ex = new URLFrameEx1();	
	}
}








