package ch12;

public class Thread_Ex1 extends Thread {

	String name;
	
	public Thread_Ex1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try 
			{
				Thread.sleep(200);//0.2초 동안 잠시 일을 멈추게 하는 기능
				System.out.println(name+" : "+i);
			}
			catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		Thread_Ex1 t1 = new Thread_Ex1("첫번째");
		Thread_Ex1 t2 = new Thread_Ex1("두번째");
		t1.start();//결과적으로 run 메서드 호출
		t2.start();
	}
}