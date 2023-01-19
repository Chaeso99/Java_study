package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.util.Iterator;

public class DesignEx3 extends MFrame{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"추가","지우기","전체지우기","종료"};
	TextField tf;
	String food[] ={"짜장면","짬뽕","우동"};
	String str = "짜장";
	
	public DesignEx3() {
		super(300,200);
		setTitle("디자인 예제3");
		setLayout(new BorderLayout());
		
		//텍스트 필드 생성, 화면 아래쪽에 배치
		tf = new TextField();
		add(tf ,BorderLayout.SOUTH); 
		tf.requestFocus();
		
		//패널 생성, 패널에 버튼들 넣음
		Panel p = new Panel();
		p.setLayout(new GridLayout(4, 1));
		for (int i = 0; i < b.length; i++) {
			b[i] = new Button(lab[i]);
			p.add(b[i]);
		}
		
		//리스트 생성, food배열을 리스트에 넣음
		list = new List();
		for (int i = 0; i < food.length; i++) {
			list.add(food[i]);
		}
		
		list.select(0); //짜장면에 포커스가 감
		add(list); //화면에 리스트 배치
		add(p, BorderLayout.EAST); //오른쪽에 패널 배치
		
		validate();
	}

	public static void main(String[] args) {
		new DesignEx3();
	}
}








