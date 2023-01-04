package ch02;

public class Ex1 {

	public static void main(String[] args) {
		//변수
		int a = 10;
		//변수는 반드시 Data Type이 있다. -종류별로 분류해야 빠르게 사용가능함
		String s = "자바";
		System.out.println(a);
		//ctrl+alt+방향키
		System.out.println(s);
		
		int/*정수*/ b = 20;
		int c = a+b;
		double/*실수(int보다 범위가 더 큼)*/ d = 20;
		//정수:short, int, long
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);

		//<-한줄 주석
		/*부분 주석 또는
		 * 여러 줄 주석*/
	}
}