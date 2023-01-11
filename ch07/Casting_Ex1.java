package ch07;

public class Casting_Ex1 {

	public static void main(String[] args) {
		int a = 1234567;
		//short s = a; //큰 단위를 작은 단위로 캐스팅하는건 불가능(코끼리가 냉장고에 들어갈수는 없다)
		short s = (short)a; //명시적 형변환을 해주면 가능
		System.out.println(a); //1234567
		System.out.println(s); //-10617  <-데이터 손실이 일어났음
		long l = a; //묵시적 형변환
		System.out.println(l); //1234567
	}
}