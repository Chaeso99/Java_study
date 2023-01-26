package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

//스레드를 적용안시키고 창을 두개 띄워서 랜덤한 위치에 원 여러개 그리기
public class RunnableFrame_Ex1 extends MFrame {

	Random r = new Random();
	int x, y;
	Color c;
	
	public RunnableFrame_Ex1(Color c) {
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
		RunnableFrame_Ex1 r1= new RunnableFrame_Ex1(Color.PINK);
		RunnableFrame_Ex1 r2= new RunnableFrame_Ex1(Color.GREEN);
		r1.run();
		r2.run();//r1의 분홍원이 다 그려지고 나서 그려지기 시작함
	}
}