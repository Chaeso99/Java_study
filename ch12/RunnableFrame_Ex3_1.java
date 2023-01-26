package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

//������ �����Ű�� â �ΰ� ����� ������ġ�� �� ������ �׸���-����� ����
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
		RunnableFrame_Ex3_1 ra[]= new RunnableFrame_Ex3_1[9];
		for (int i = 0; i < ra.length; i++) {
			int x1 = 200 + (185*(i%3)); //0, 1, 2
			int y1 = 200 + (185*(i/3)); //0, 1, 2
			ra[i] = new RunnableFrame_Ex3_1(x1, y1);
			new Thread(ra[i]).start();
		}//--for
	}
}