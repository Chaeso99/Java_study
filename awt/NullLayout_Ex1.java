package awt;

import java.awt.Button;

public class NullLayout_Ex1 extends MFrame {
	
	Button btn1, btn2;
	
	public NullLayout_Ex1() {
		setLayout(null);
		btn1 = new Button("��ư1");
		btn2 = new Button("��ư2");
		btn1.setBounds(10, 50, 50, 50);
		btn2.setBounds(100, 50, 50, 50);
		add(btn1);
		add(btn2);
	}

	public static void main(String[] args) {
		new NullLayout_Ex1();
	}
}