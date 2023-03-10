package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Console;
import java.awt.event.ItemListener;

public class Choice_Ex3 extends MFrame
implements ItemListener{

	Choice name, star;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	
	public Choice_Ex3() {
		name = new Choice();
		name.add("남자연예인");
		name.add("여자연예인");
		star = new Choice();
//		for (int i = 0; i < ms.length; i++) {
//			star.add(ms[i]);
//		}
		inputItem(star, ms);
		add(name);
		add(star);
		name.addItemListener(this);
	}
	
	public void inputItem(Choice c, String item[])
	{
		c.removeAll(); //기존 아이템 삭제
		
		//아이템 추가
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//아이템의 name이 "남자연예인" 인지 검사->남자연예인 목록 inputItem
		if (name.getSelectedItem().equals("남자연예인")) {
			inputItem(star, ms);
		} 
		//아이템의 name이 "여자연예인" 인지 검사->여자연예인 목록 inputItem
		else if (name.getSelectedItem().equals("여자연예인")) {
			inputItem(star, fs);
		}
	}

	public static void main(String[] args) {
		new Choice_Ex3();
	}

}
