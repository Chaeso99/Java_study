package ch08;

interface Interface2{
	int a = 10; //필드는 무조건 상수라서 (static final) 초기화 시켜줘야함
	//void prn() {} //일반메서드는 선언불가
	void prn();
}

interface Interface2_1 extends Interface2{
	void prn1();
}

class MyClass3 implements Interface2_1{

	@Override
	public void prn() {
	}

	@Override
	public void prn1() {
	}

}

public class Interface_Ex2 {

	public static void main(String[] args) {

	}

}
