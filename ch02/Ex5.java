package ch02;

public class Ex5 {

	public static void main(String[] args) {
		//기본형 타입의 형변환
		int a = 10;
		long b = a;
		//b는 a의 값을 복사만 하고 복사후에는 둘이 관계없음(참조형과 차이 있다)
		//데이터 타입이 작은쪽에서 큰쪽으로 가는것:묵시적 형 변환 - 아무런 문제 없음
		short c = (short)a;
		//데이터 타입이 큰쪽에서 작은쪽으로 가는것:명시적 형 변환-앞에(short) 처럼 지정해줘야함
		a = 32768; //short의 MAX값 : 32767
		c = (short)a;
		System.out.println(c); //short의 최대 범위를 넘어가버려서 값이 음수로 나옴
	}
}