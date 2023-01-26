package ch12;


public class Synchronized_Ex1 implements Runnable{

	public synchronized void a(String who) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + "b() ȣ��");
		b(who);
	}
	
	public synchronized void b(String who) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + "a() ȣ��");
		a(who);
	}
	
	@Override
	public void run() {
		b(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Synchronized_Ex1 sch = new Synchronized_Ex1();
		Thread t1 = new Thread(sch, "ù��°");
		Thread t2 = new Thread(sch, "�ι�°");
		t1.start();
		t2.start();
		//����� ù��°a(),b() �� ���´�
	}

}