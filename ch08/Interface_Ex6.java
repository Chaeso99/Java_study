package ch08;


public class Interface_Ex6  implements Runnable{

	String name;
	
	public Interface_Ex6(String name)
	{
		this.name = name;
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ":" + name);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		Interface_Ex6 a = new Interface_Ex6("첫번째");
		Interface_Ex6 b = new Interface_Ex6("두번째");
		//a.run();
		//b.run(); a.run()메서드가 다돌아가고 나서 b.run()메서드가 돌아감
		
		new Thread(a).start(); //멀티스레드가 돌아가서 둘이 동시에 실행됨(run()메서드 호출)
		new Thread(b).start(); //멀티스레드가 돌아가서 둘이 동시에 실행됨(run()메서드 호출)
	}

}
