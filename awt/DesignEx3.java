package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.util.Iterator;

public class DesignEx3 extends MFrame{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"�߰�","�����","��ü�����","����"};
	TextField tf;
	String food[] ={"¥���","«��","�쵿"};
	String str = "¥��";
	
	public DesignEx3() {
		super(300,200);
		setTitle("������ ����3");
		setLayout(new BorderLayout());
		
		//�ؽ�Ʈ �ʵ� ����, ȭ�� �Ʒ��ʿ� ��ġ
		tf = new TextField();
		add(tf ,BorderLayout.SOUTH); 
		tf.requestFocus();
		
		//�г� ����, �гο� ��ư�� ����
		Panel p = new Panel();
		p.setLayout(new GridLayout(4, 1));
		for (int i = 0; i < b.length; i++) {
			b[i] = new Button(lab[i]);
			p.add(b[i]);
		}
		
		//����Ʈ ����, food�迭�� ����Ʈ�� ����
		list = new List();
		for (int i = 0; i < food.length; i++) {
			list.add(food[i]);
		}
		
		list.select(0); //¥��鿡 ��Ŀ���� ��
		add(list); //ȭ�鿡 ����Ʈ ��ġ
		add(p, BorderLayout.EAST); //�����ʿ� �г� ��ġ
		
		validate();
	}

	public static void main(String[] args) {
		new DesignEx3();
	}
}








