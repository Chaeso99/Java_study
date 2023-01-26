package ch12;


public class Synchronized_Ex1 implements Runnable{

	public synchronized void a(String who) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + "b() 호출");
		b(who);
	}
	
	public synchronized void b(String who) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + "a() 호출");
		a(who);
	}
	
	@Override
	public void run() {
		b(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Synchronized_Ex1 sch = new Synchronized_Ex1();
		Thread t1 = new Thread(sch, "첫번째");
		Thread t2 = new Thread(sch, "두번째");
		t1.start();
		t2.start();
		//결과로 첫번째a(),b() 만 나온다
	}

}