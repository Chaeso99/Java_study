package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//2. 버튼을 클릭하면 ActionEvent 객체가 발생 ->이벤트 소스와 ActionEvent 객체를 연결하기 위한 ActionListener를 구현

public class Event_Ex1 extends MFrame  implements ActionListener
{

	//1. 이벤트 소스 생성
	Button btn;
	
	public Event_Ex1() {
		add(btn = new Button("버튼"), BorderLayout.SOUTH);
		//4.이벤트소스랑 이벤트핸들러 연결(add.XxxListener)
		btn.addActionListener(this);//ActionListener 구현한게 지금 이 클래스라서 this임. 익명클래스 사용하는 경우는 this로 안함
		validate();
	}
	
	//3.이벤트리스너의 메서드(이벤트핸들러) 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
	
	public static void main(String[] args) {
		new Event_Ex1();
	}

}
