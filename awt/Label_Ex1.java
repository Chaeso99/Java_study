package awt;

import java.awt.Label;
import java.util.Iterator;

public class Label_Ex1 extends MFrame {

	Label label1, label2, label3, label4;
	
//	public List_Ex1() {
//		//200, 200 ũ���� â ����
//		super(200, 200);
//		setTitle("Label Example");
//		String str = "������ ������";
//		//�� ����, ���� ����
//		label1 = new Label(str);
//		label2 = new Label(str, Label.CENTER);
//		label3 = new Label(str, Label.RIGHT);
//		label4 = new Label(str, Label.LEFT);
//		//�� ���� ����(����������)
//		label1.setBackground(MColor.rColor());
//		label2.setBackground(MColor.rColor());
//		label3.setBackground(MColor.rColor());
//		label4.setBackground(MColor.rColor());
//		//���� �����ӿ� ���Խ�Ŵ
//		add(label1);
//		add(label2);
//		add(label3);
//		add(label4);
//	}
	
	Label label[] = new Label[4];
	int pos[] = { Label.LEFT, Label.CENTER, Label.RIGHT, Label.LEFT };

	public Label_Ex1() {
		super(200, 200);
		String str = "������ ������";
		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(str, pos[i]);
			label[i].setBackground(MColor.rColor());
			add(label[i]);
		}
		validate(); //���ΰ�ħ
	}

	public static void main(String[] args) {
		new Label_Ex1();
	}
}