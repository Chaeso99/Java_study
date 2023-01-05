package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends MFrame
{
	//500x500, 하얀색 바탕(WHITE), Resize:false 인 창 띄우기-MFrame 클래스 상속받아야함
	Random r;
	
	public MyFrame() 
	{
		super(500, 500, Color.WHITE, false);
		r = new Random();//랜덤 객체
	}
	
	//창 안에서 랜덤한 크기, 좌표, 색의 사각형을 1000개 만들기
	public void paint(Graphics g) 
	{
		if(r==null)
			return;
		g.setColor(Color.BLUE);//붓에 노란색 물감 세팅
		//g.drawString("반갑습니다", 50, 50); //반갑습니다 라는 글자를 50,50 좌표에 그려라. (프로그램에서는 왼쪽위가 0, 0임)
		for(int i = 0; i < 1000; i++)
		{
			g.setColor (rColor());
		int x = r.nextInt(500);
		int y = r.nextInt(500);
		int w = r.nextInt(10)+5;
		int h = r.nextInt(10)+5;
		//g.drawRect(x, y, w, h); //안이 빈 사각형
		g.fillRect(x, y, w, h); //안이 채워진 사각형
		try 
		{
			Thread.sleep(10);
		} 
		catch (Exception e) 
		{
		
		}//0.5초
		
		}//--for
	}//--paint
	
	public  Color rColor()
	{
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}
	
	public static void main(String[] args) 
	{
//		Frame f = new Frame();
//		f.setSize(300, 300);
//		f.setVisible(true);
		
//		MFrame m = new MFrame();
		//상속을 이용했으므로 코드는 간단하지만 위에만든 창보다 기능이 많음.
		new MyFrame();
	}
}