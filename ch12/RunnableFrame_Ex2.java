package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

//������ �����Ű�� â �ΰ� ����� ������ġ�� �� ������ �׸���
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
			}//0.5��
		}//--for
	}
	
	//paint�� ���ΰ�ħ �����Ŷ� �����Ÿ� ����� �׸�
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x,  y, 10, 10);
	}
	
	//�����Ÿ� ���ܵΰ� ���� �׸��� �ְ� ����
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
		t2.start();//���ÿ� ������ �Ķ��� �Ѵ� ������ ������
	}
}