package ch13;

class Box1{//������Ʈ Ÿ���̶� �پ��� Ÿ���� �����͸� ������ �� �ִ�.
	private Object data;
	
	public void set(Object data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
}

class Box2<T>{
	private T data;
	public void set(T data) {this.data = data;}
	public T get() {return data;}
}

public class GenericEx1 {

	public static void main(String[] args) {
		Box1 b = new Box1();
		b.set(Integer.valueOf(22));
		Integer i = (Integer)b.get();
		b.set("����");
		//Integer i2 = (Integer)b.get(); //ĳ���� ����(��Ʈ���� ��Ƽ�� ������ ��ȯ�Ϸ��� �ؼ�)
		
		Box2<String> b2 = new Box2<String>();
		b2.set("����");
		//b2.set(Integer.valueOf(23)); //String Ÿ���ε� Integer Ÿ�� �־��ٰ� ������
		
		System.out.println("b�� "+b.get());
		System.out.println("b2�� "+b2.get());
	}
}