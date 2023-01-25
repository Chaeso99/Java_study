package graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageViews_Ex1 extends MFrame {

	Image img;
	
	public ImageViews_Ex1() {
		super(500,350);
		img = Toolkit.getDefaultToolkit().getImage("graphics/aaa.jpg");
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageViews_Ex1();
	}
}