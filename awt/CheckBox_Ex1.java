package awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox_Ex1 extends MFrame 
implements ItemListener{

	//�ʵ� ����
	Checkbox cb1, cb2, cb3;
	Checkbox rb1, rb2, rb3;
	CheckboxGroup grp;
	
	public CheckBox_Ex1()
	{
		//â ����
		super(220, 250);
		
		//üũ�ڽ� ����
		add(cb1 = new Checkbox("����1", false));
		add(cb2 = new Checkbox("����2", true));
		add(cb3 = new Checkbox("����3", false));
		//üũ�ڽ� �׷� ����, �׷쿡 üũ�ڽ��� �߰�
		grp = new CheckboxGroup();
		add(rb1 = new Checkbox("����1", grp, true));
		add(rb2 = new Checkbox("����2", grp, true));
		add(rb3 = new Checkbox("����3", grp, true));
		//�����۸�����(�̺�Ʈ�� ó������) �߰�
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		
		//âũ�� ���� Ȱ��ȭ, ���ΰ�ħ
		setResizable(true);
		validate();
	}
	
	//������ ���� ��ü(â ������ �ֱٿ� ����� ������ ���·�)
	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel()+" : " + cb.getState();
		setTitle(str);
	}
	
	public static void main(String[] args) {
		new CheckBox_Ex1();
	}
}