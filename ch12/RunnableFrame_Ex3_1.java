package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

//스레드 적용시키고 창 두개 띄워서 랜덤위치에 원 여러개 그리기-강사님 버전
public class RunnableFrame_Ex3_1 extends MFrame 
implements Runnable{

	Random r = new Random();
	int x, y;
	Color c;
	
	public RunnableFrame_Ex3_1(int x1, int y1) {
		super(200, 200);
		setLocation(x1, y1);
		c = MColor.rColor();
	}
	
	public void run() {
		for (int i = 0; i < 30; i++) {
			x = r.nextInt(200);
			y = r.nextInt(200);
			try {
				Thread.sleep(500);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5초
		}//--for
	}
	
	//paint는 새로고침 같은거라서 기존거를 지우고 그림
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x,  y, 10, 10);
	}
	
	//기존거를 남겨두고 새로 그릴수 있게 해줌
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}
	
	public static void main(String[] args) {
		RunnableFrame_Ex3_1 ra[]= new RunnableFrame_Ex3_1[9];
		for (int i = 0; i < ra.length; i++) {
			int x1 = 200 + (185*(i%3)); //0, 1, 2
			int y1 = 200 + (185*(i/3)); //0, 1, 2
			ra[i] = new RunnableFrame_Ex3_1(x1, y1);
			new Thread(ra[i]).start();
		}//--for
	}
}