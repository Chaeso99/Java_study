package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Exit 버튼 클릭해도 종료가 되도록 만들것
public class MyFrame extends MFrame_09 
{
	Button btn;
	
	public MyFrame() 
	{
		add(btn = new Button("Exit"), BorderLayout.SOUTH);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) 
	{
		new MyFrame();
	}
}