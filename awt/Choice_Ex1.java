package awt;

import java.awt.Choice;
import java.awt.Color;

public class Choice_Ex1 extends MFrame{

	//�ʵ� ����
	String city[] = {"���ø� �����ϼ���.","������","�� ��",
			"�Ͽ���","�� ��","�� ��","�� ��"};
	Choice ch;
	
	//â ����, Choice ��ü ����, Choice�� city�迭�� �߰�
	public Choice_Ex1() {
		super(300, 300, new Color(100, 200, 100));
		ch = new Choice();
		for (int i = 0; i < city.length; i++) {
			ch.add(city[i]);
		}
		//â�� ch �߰�
		add(ch);
	}
	
	public static void main(String[] args) {
		new Choice_Ex1();
	}

}
