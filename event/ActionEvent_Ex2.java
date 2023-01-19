package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class ActionEvent_Ex2 extends MFrame
implements ActionListener{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"�߰�","�����","��ü�����","����"};
	TextField tf;
	String food[] ={"¥���","«��","�쵿"};
	
	public ActionEvent_Ex2() {
		super(300,200);
		setTitle("������ ����3");
		setLayout(new BorderLayout());
		
		tf = new TextField();
		add(tf ,BorderLayout.SOUTH);
		tf.addActionListener(this);
		tf.requestFocus();
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(4, 1));
		for (int i = 0; i < b.length; i++) {
			b[i] = new Button(lab[i]);
			p.add(b[i]);
			b[i].addActionListener(this);
		}
		
		//����Ʈ ����, food�迭�� ����Ʈ�� ����
		list = new List();
		for (int i = 0; i < food.length; i++) {
			list.add(food[i]);
		}
		
		list.select(0);
		add(list);
		add(p, BorderLayout.EAST);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	String cmd = e.getActionCommand();
	
	if(cmd.equals(lab[0])||tf == e.getSource())
	{
		String str = tf.getText();
		if(str.trim().length()==0) 
		{
			tf.setText("");
			tf.requestFocus();
			setTitle("���ڿ��� �Է��ϼ���");
			return;
		}
		list.add(str);
		tf.setText("");
		tf.requestFocus();
	}
	
	else if(cmd.equals(lab[1]))
	{
	int idx = list.getSelectedIndex();
	if(idx==-1)
	{
		setTitle("������ �������� �����ϼ���");
		return;
	}
	list.remove(idx);
	}
	else if(cmd.equals(lab[2]))
	{
	list.removeAll();
	}
	else if(cmd.equals(lab[3]))
	{
	System.exit(0);
	}
}

	public static void main(String[] args) {
		new ActionEvent_Ex2();
	}
}






