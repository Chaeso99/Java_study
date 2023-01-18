package awt;

import java.awt.Label;
import java.util.Iterator;

public class Label_Ex1 extends MFrame {

	Label label1, label2, label3, label4;
	
//	public List_Ex1() {
//		//200, 200 크기의 창 생성
//		super(200, 200);
//		setTitle("Label Example");
//		String str = "오늘은 수요일";
//		//라벨 생성, 정렬 지정
//		label1 = new Label(str);
//		label2 = new Label(str, Label.CENTER);
//		label3 = new Label(str, Label.RIGHT);
//		label4 = new Label(str, Label.LEFT);
//		//라벨 배경색 지정(랜덤색으로)
//		label1.setBackground(MColor.rColor());
//		label2.setBackground(MColor.rColor());
//		label3.setBackground(MColor.rColor());
//		label4.setBackground(MColor.rColor());
//		//라벨을 프레임에 포함시킴
//		add(label1);
//		add(label2);
//		add(label3);
//		add(label4);
//	}
	
	Label label[] = new Label[4];
	int pos[] = { Label.LEFT, Label.CENTER, Label.RIGHT, Label.LEFT };

	public Label_Ex1() {
		super(200, 200);
		String str = "오늘은 수요일";
		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(str, pos[i]);
			label[i].setBackground(MColor.rColor());
			add(label[i]);
		}
		validate(); //새로고침
	}

	public static void main(String[] args) {
		new Label_Ex1();
	}
}