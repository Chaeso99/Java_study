package ch13;

class Box1{//오브젝트 타입이라서 다양한 타입의 데이터를 저장할 수 있다.
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
		b.set("하하");
		//Integer i2 = (Integer)b.get(); //캐스팅 오류(스트링을 인티저 형으로 변환하려고 해서)
		
		Box2<String> b2 = new Box2<String>();
		b2.set("하하");
		//b2.set(Integer.valueOf(23)); //String 타입인데 Integer 타입 넣었다고 오류남
		
		System.out.println("b는 "+b.get());
		System.out.println("b2는 "+b2.get());
	}
}