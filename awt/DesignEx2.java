package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DesignEx2 extends MFrame{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx2() {
		super(500,400);
		setTitle("디자인 예제2");
		setLayout(new BorderLayout());
		
		//텍스트 필드 생성, hello jun 글자가 나오게 함, 패널에 텍스트필드를 붙임
		tf = new TextField("Hello JUN", 30);
		p1 = new Panel();
		p1.add(tf);
		
		//텍스트 에어리어 생성
		ta = new TextArea();
		
		//p2패널 생성, 버튼을 패널에 넣음
		p2 = new Panel();
		p2.add(btn1 = new Button ("마우스시험용"));
		p2.add(btn2 = new Button ("종료"));

		
		add(p1, BorderLayout.NORTH);
		add(ta);
		add(p2, BorderLayout.SOUTH);
		validate();
	}
	
	
	public static void main(String[] args) {
		new DesignEx2();
	}
}

