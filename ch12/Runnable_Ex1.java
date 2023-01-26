package ch12;

public class Runnable_Ex1 implements Runnable{

	String name;
	
	public Runnable_Ex1(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try 
			{
				Thread.sleep(200);//0.2�� ���� ��� ���� ���߰� �ϴ� ���
				System.out.println(name+" : "+i);
			}
			catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		Runnable_Ex1 r1 = new Runnable_Ex1("�ϳ�");
		Runnable_Ex1 r2 = new Runnable_Ex1("��");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();//JVM�ȿ� �ִ� Thread �����ٷ����� ���
		t2.start();
	}
}
