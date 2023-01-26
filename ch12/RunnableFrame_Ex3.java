package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

//스레드 적용시키고 9개의 창을 3열 3행으로 띄워서 랜덤위치에 원 여러개 그리기-내가만든거
public class RunnableFrame_Ex3 extends MFrame 
implements Runnable{

	Random r = new Random();
	int x, y;
	Color c;
	static int xcount, ycount;
	
	public RunnableFrame_Ex3(Color c) {
		super(200, 200);
		setLocation(600+(xcount*185), 300+(ycount*185));
		this.c = c;
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
			}
		}//--for
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x,  y, 10, 10);
	}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}
	
	public static void main(String[] args) {
		RunnableFrame_Ex3 r1 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 1;
		RunnableFrame_Ex3 r2 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 2;
		RunnableFrame_Ex3 r3 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 0; ycount = 1;
		RunnableFrame_Ex3 r4 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 1;
		RunnableFrame_Ex3 r5 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 2;
		RunnableFrame_Ex3 r6 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 0; ycount =2;
		RunnableFrame_Ex3 r7 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 1;
		RunnableFrame_Ex3 r8 = new RunnableFrame_Ex3(MColor.rColor());
		xcount = 2;
		RunnableFrame_Ex3 r9 = new RunnableFrame_Ex3(MColor.rColor());
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);
		Thread t7 = new Thread(r7);
		Thread t8 = new Thread(r8);
		Thread t9 = new Thread(r9);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
	}
}