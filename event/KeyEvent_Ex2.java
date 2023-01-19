package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvent_Ex2 extends MFrame {

	Button move;
	
	public KeyEvent_Ex2() {
		super(400, 500, new Color(100, 200, 100));
		setLayout(null);
		move = new Button("move");
		move.setBounds(200, 250, 50, 30);
		move.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				String txt = KeyEvent.getKeyText(code);
				//System.out.println(code+" : "+ txt);
				int x = move.getX();
				int y = move.getY();
				if(txt.equals("Right"))
				{
					x = x+10;
				}else if(txt.equals("Left")){
					x = x-10;
				}else if(txt.equals("Up")){
					y = y-10;
				}else if(txt.equals("Down")){
					y = y+10;
				}
				if(x>0&&x<getWidth()-50&&y>20&&y<getHeight()-30) {
				move.setLocation(x, y);
				}
			}
		});
		add(move);
		move.requestFocus();
		
		validate();
	}
	
	public static void main(String[] args) {
		new KeyEvent_Ex2();
	}

}
