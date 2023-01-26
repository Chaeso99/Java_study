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
				Thread.sleep(200);//0.2�� ���� ��� ���� ���߰� �ϴ� ���
				System.out.println(name+" : "+i);
			}
			catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		Thread_Ex1 t1 = new Thread_Ex1("ù��°");
		Thread_Ex1 t2 = new Thread_Ex1("�ι�°");
		t1.start();//��������� run �޼��� ȣ��
		t2.start();
	}
}