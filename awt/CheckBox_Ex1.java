package awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox_Ex1 extends MFrame 
implements ItemListener{

	//필드 선언
	Checkbox cb1, cb2, cb3;
	Checkbox rb1, rb2, rb3;
	CheckboxGroup grp;
	
	public CheckBox_Ex1()
	{
		//창 생성
		super(220, 250);
		
		//체크박스 생성
		add(cb1 = new Checkbox("선택1", false));
		add(cb2 = new Checkbox("선택2", true));
		add(cb3 = new Checkbox("선택3", false));
		//체크박스 그룹 생성, 그룹에 체크박스들 추가
		grp = new CheckboxGroup();
		add(rb1 = new Checkbox("라디오1", grp, true));
		add(rb2 = new Checkbox("라디오2", grp, true));
		add(rb3 = new Checkbox("라디오3", grp, true));
		//아이템리스너(이벤트를 처리해줌) 추가
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		
		//창크기 조절 활성화, 새로고침
		setResizable(true);
		validate();
	}
	
	//아이템 상태 교체(창 제목을 최근에 변경된 아이템 상태로)
	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel()+" : " + cb.getState();
		setTitle(str);
	}
	
	public static void main(String[] args) {
		new CheckBox_Ex1();
	}
}
