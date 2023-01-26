package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

//스레드 적용시키고 창 두개 띄워서 랜덤위치에 원 여러개 그리기
public class RunnableFrame_Ex2 extends MFrame 
implements Runnable{

	Random r = new Random();
	int x, y;
	Color c;
	
	public RunnableFrame_Ex2(Color c) {
		super(300, 300);
		this.c = c;
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			x = r.nextInt(300);
			y = r.nextInt(300);
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
		RunnableFrame_Ex2 r1 = new RunnableFrame_Ex2(Color.RED);
		RunnableFrame_Ex2 r2 = new RunnableFrame_Ex2(Color.BLUE);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();//동시에 빨강원 파랑원 둘다 찍히기 시작함
	}
}