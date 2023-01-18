package awt;

import java.awt.Canvas;

public class Canvas_Ex1 extends MFrame {

	Canvas c;
	
	public Canvas_Ex1() {
		c = new Canvas();
		c.setSize(100, 100);
		c.setBackground(MColor.rColor());
		add(c);
	}
	
	public static void main(String[] args) {
		new Canvas_Ex1();
	}

}
