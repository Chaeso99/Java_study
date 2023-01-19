package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_Ex1 extends MFrame implements ActionListener, MouseListener {

	TextField tf;
	TextArea ta;
	Button bt1, bt2, bt3;
	
	public MouseEvent_Ex1() {
		super(400, 500);
		setTitle("MouseEventEx1");
		tf = new TextField("�ȳ��ϼ���!!!", 30);
		ta = new TextArea();
		bt1 = new Button("���콺�����");
		bt2 = new Button("�λ��ϱ�");
		bt3 = new Button("����");
		Panel p1 = new Panel();
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		Panel p2 = new Panel();
		p2.add(tf);
		add(p1, BorderLayout.SOUTH);
		add(p2, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		tf.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt1.addMouseListener(this);
		validate();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ta.append("##mouseClicked\n");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		ta.append("##mousePressed\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		ta.append("##mouseReleased\n");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		ta.append("##mouseEntered\n");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		ta.append("##mouseExited\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o==tf){
			ta.append(tf.getText()+"\n");
			tf.setText("");
			tf.requestFocus();
		}else if(o==bt2){
			ta.append("�λ��ϱ� ��ư�� ��������.\n");
		}else if(o==bt3){
			setVisible(false);
			System.exit(0);;
		}
	}

	public static void main(String[] args) {
		new MouseEvent_Ex1();
	}

}
