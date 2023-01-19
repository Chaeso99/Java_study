package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Ex4 extends MFrame {
	
	Button btn1, btn2;
	
	public Event_Ex4() {
		Panel p = new Panel();
		p.add(btn1 = new Button("��ư1"));
		p.add(btn2 = new Button("��ư2"));
		add(p, BorderLayout.SOUTH);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(MColor.rColor());
			}
		});
		btn2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}


	public static void main(String[] args) {
		new Event_Ex4();
	}

}
