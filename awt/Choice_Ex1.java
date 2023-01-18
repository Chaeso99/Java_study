package awt;

import java.awt.Choice;
import java.awt.Color;

public class Choice_Ex1 extends MFrame{

	//필드 선언
	String city[] = {"도시를 선택하세요.","베를린","파 리",
			"하와이","런 던","평 양","뉴 욕"};
	Choice ch;
	
	//창 생성, Choice 객체 생성, Choice에 city배열을 추가
	public Choice_Ex1() {
		super(300, 300, new Color(100, 200, 100));
		ch = new Choice();
		for (int i = 0; i < city.length; i++) {
			ch.add(city[i]);
		}
		//창에 ch 추가
		add(ch);
	}
	
	public static void main(String[] args) {
		new Choice_Ex1();
	}

}
