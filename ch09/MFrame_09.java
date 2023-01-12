package ch09;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame_09 extends Frame{

	public MFrame_09() {
		this(300,300,new Color(220,220,220),false);
	}

	public MFrame_09(int w, int h) {
		this(w,h,new Color(220,220,220),false);
	}

	public MFrame_09(Color c) {
		this(300,300,c,false);
	}

	public MFrame_09(int w, int h,Color c ) {
		this(w,h,c,false);
	}

	public MFrame_09(int w, int h, Color c, boolean flag) {
		setSize(w, h);
		setBackground(c);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setResizable(flag);
	}

}
