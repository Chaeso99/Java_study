package ch13;
//미리 동적으로 타입을 정해놓고 메서드를 사용
interface Pair<K, V>{
	
	public K getKey();
	public V getValue();
	
}

class OrderPair<K, V> implements Pair<K, V>{
	
	public K key;
	public V value;
	
	public OrderPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public V getValue() {
		return value;
	}
}

public class GenericEx2 {
	public static void main(String[] args) {
		OrderPair<String, Integer> p1 = new OrderPair<String, Integer>("Even", 8);
		OrderPair<String, String> p2 = new OrderPair<String, String>("Hello", "world");
		System.out.println(p1.getKey()+" : "+p1.getValue());
		System.out.println(p2.getKey()+" : "+p2.getValue());
	}
}