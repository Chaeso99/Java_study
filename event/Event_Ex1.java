package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//2. ��ư�� Ŭ���ϸ� ActionEvent ��ü�� �߻� ->�̺�Ʈ �ҽ��� ActionEvent ��ü�� �����ϱ� ���� ActionListener�� ����

public class Event_Ex1 extends MFrame  implements ActionListener
{

	//1. �̺�Ʈ �ҽ� ����
	Button btn;
	
	public Event_Ex1() {
		add(btn = new Button("��ư"), BorderLayout.SOUTH);
		//4.�̺�Ʈ�ҽ��� �̺�Ʈ�ڵ鷯 ����(add.XxxListener)
		btn.addActionListener(this);//ActionListener �����Ѱ� ���� �� Ŭ������ this��. �͸�Ŭ���� ����ϴ� ���� this�� ����
		validate();
	}
	
	//3.�̺�Ʈ�������� �޼���(�̺�Ʈ�ڵ鷯) ����
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
	
	public static void main(String[] args) {
		new Event_Ex1();
	}

}
