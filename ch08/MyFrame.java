package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//MFrame은 6대, MyFrame은 7대 클래스임
//버튼을 누르면 화면의 색이 왔다갔다 변하게 만들기-많이 사용하고, 가장 심플한 예제
public class MyFrame extends MFrame implements ActionListener
{
	Button btn; //버튼을 위한 필드(메소드가 공유할 목적으로 만듬)
	boolean flag = false;
	
	public MyFrame() {
		btn = new Button("Button");
		add(btn,BorderLayout.SOUTH);
		setBackground(Color.ORANGE);
		btn.addActionListener(this); //actionPerformed 연결 메서드, 내 자신이 ActionListener 타입이므로 this가 가능
		//동작원리:버튼을 클릭하면 ActionEvent 객체가 내부적으로 생성됨
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag)
		{
			setBackground(Color.ORANGE);
		}
		else
			setBackground(Color.PINK);
		flag =! flag;
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}