package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;

public class Panel_Ex1 extends MFrame {

	Label label[] = new Label[3];
	Button btn[] = new Button[3];
	String str1[] = {"첫번째", "두번째", "세번째"};
	String str2[] = {"Start", "Stop", "End"};
	
	public Panel_Ex1() {
	setLayout(new BorderLayout());
	Panel p1, p2;
	p1 = new Panel();
	p1.setBackground(MColor.rColor());
	for (int i = 0; i < label.length; i++) {
		p1.add(label[i]= new Label(str1[i]));
		label[i].setBackground(MColor.rColor());
	}
	p2 = new Panel();
	p2.setBackground(MColor.rColor());
	for (int i = 0; i < label.length; i++) {
		p2.add(label[i]= new Label(str2[i]));
		label[i].setBackground(MColor.rColor());
	}
	add(p1, BorderLayout.NORTH);
	add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new Panel_Ex1();
	}

}
