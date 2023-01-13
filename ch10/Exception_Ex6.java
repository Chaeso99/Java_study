package ch10;

public class Exception_Ex6 {

	public static void main(String[] args) {
		try {
			exce3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exce1() throws Exception{} //예외가 일어나면 exce2에게 던짐
	public static void exce2() throws Exception{
		exce1();
	} //예외가 일어나면 exce3에게 던짐
	public static void exce3() throws Exception{
		exce2();
	} //예외를 처리해야함
	
}