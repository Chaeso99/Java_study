package ch12;

class NoThread2{
	String name;
	
	public NoThread2(String name) {
		this.name = name;
	}

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
	public void start() {
		run();
	}
}

public class Thread_Ex2 {
	
	public static void main(String[] args) {
		NoThread2 n1 = new NoThread2("First");
		NoThread2 n2 = new NoThread2("Second");
		n1.start();
		n2.start();
	}

}
