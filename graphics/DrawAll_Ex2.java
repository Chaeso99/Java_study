package graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawAll_Ex2 extends MFrame 
implements ActionListener {

	Panel p1,p2;
	int mode=1/*0-선,1-사각형,2-원*/,color;
	Label l[];
	Checkbox fillcb;
	Checkbox cb[] = new Checkbox[3];
	CheckboxGroup cbg;
	TextField tf[];
	Button b[] = new Button[4];
	Button btn;
	MCanvas canvas;
	String sl[] = {"선","사각형","원","랜덤색"};
	String cl[] = {"R","G","B"};
	String ll[] = {"X1","Y1","X2","Y2 "};
	String rl[] = {"X","Y","W","H "};
	String ol[] = {"X","Y","너비","높이"};
	
	public DrawAll_Ex2() {
		super(600,300);
		setTitle("선그리기");
		makeAWT();
		p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		for (int i = 0; i < b.length; i++) {
			p1.add(b[i]);
		}
		add(p1,BorderLayout.EAST);
		p2.setBackground(Color.yellow);
		for (int i = 0; i < l.length; i++) {
			p2.add(l[i]);
			p2.add(tf[i]);
		}
		for (int i = 0; i < cb.length; i++) {
			p2.add(cb[i]);
		}
		p2.add(btn);
		selectPanel(mode);
		add(p2,BorderLayout.SOUTH);
		add(canvas = new MCanvas());
		validate();
	}//DrawAllEx02
	
	public void selectPanel(int mode) {
		setTitle(sl[mode]+"그리기");
		switch (mode) {
		case 0:
			p2.setBackground(Color.YELLOW);
			for (int i = 0; i < l.length; i++) {
				l[i].setText(ll[i]);
				l[i].setBackground(Color.YELLOW);
			}
			for (int i = 0; i < cb.length; i++) {
				cb[i].setBackground(Color.YELLOW);
			}
			p2.remove(fillcb);
			break;
		case 1:
			p2.remove(fillcb);
			p2.setBackground(Color.PINK);
			for (int i = 0; i < l.length; i++) {
				l[i].setText(rl[i]);
				l[i].setBackground(Color.PINK);
			}
			for (int i = 0; i < cb.length; i++) {
				cb[i].setBackground(Color.PINK);
			}
			p2.add(fillcb,8);
			break;
		case 2:
			p2.remove(fillcb);
			p2.setBackground(Color.CYAN);
			for (int i = 0; i < l.length; i++) {
				l[i].setText(ol[i]);
				l[i].setBackground(Color.CYAN);
			}
			for (int i = 0; i < cb.length; i++) {
				cb[i].setBackground(Color.CYAN);
			}
			p2.add(fillcb,8);
			break;	
		}
	}//selectPanel

	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		for (int i = 0; i < b.length-1; i++) {
			if(obj==b[i]){
				mode=i;
				selectPanel(mode);
				break;
			}
		}
		if(obj==b[3]/*랜덤*/){
			Color c[] = MColor.rColor2();
			for (int i = 0; i < b.length; i++) {
				b[i].setBackground(c[0]);
				b[i].setForeground(c[1]);
				tf[i].setBackground(c[0]);
				tf[i].setForeground(c[1]);
			}
			btn.setBackground(c[0]);
			btn.setForeground(c[1]);
		}else if(obj==btn/*그리기 버튼*/){
			Checkbox cbx = cbg.getSelectedCheckbox();
			for (int i = 0; i < cb.length; i++) {
				if(cbx==cb[i]){
					color = i;
					break;
				}//if
			}//for
			canvas.repaint();
		}//if
	}//actionPerformed

	
	public void makeAWT(){
		p1 = new Panel();
		p2 = new Panel();
		l = new Label[4];
		for (int i = 0; i < l.length; i++) {
			l[i] = new Label();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = new Button(sl[i]); 
			b[i].addActionListener(this); 
		}
		tf = new TextField[4];
		for (int i = 0; i < tf.length; i++) {
			tf[i] = new TextField("30",3);
		}
		fillcb = new Checkbox("채우기");
		cbg = new CheckboxGroup();
		for (int i = 0; i < cb.length; i++) {
			cb[i]=new Checkbox(cl[i],cbg,false);
		}
		btn = new  Button("그리기");
		btn.addActionListener(this);
	}
	
	class MCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			//4개의 TextFiled에 입력된 값을 배열로 리턴받는다.
			int i[] = new int[4];
			for (int j = 0; j < i.length; j++) {
				i[j] = Integer.parseInt(tf[j].getText());
			}
			////////////////////////////////////
			switch (color) {
			case 0:g.setColor(Color.RED); break;
			case 1:g.setColor(Color.GREEN); break;
			case 2:g.setColor(Color.BLUE); break;
			}
			////////////////////////////////////
			switch (mode) {
			case 0://선
				g.drawLine(i[0],i[1],i[2],i[3]);
				break;
			case 1://사각형
				if(fillcb.getState()){
					g.fillRect(i[0],i[1],i[2],i[3]);
				}else{
					g.drawRect(i[0],i[1],i[2],i[3]);
				}
				break;
			case 2://원
				if(fillcb.getState()){
					g.fillOval(i[0],i[1],i[2],i[3]);
				}else{
					g.drawOval(i[0],i[1],i[2],i[3]);
				}
				break;
			}//switch
		}//paint
	}

	public static void main(String[] args) {
		new DrawAll_Ex2();
	}
}