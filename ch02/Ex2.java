package ch02;

public class Ex2 {

	public static void main(String[] args) {
		//변수는 위에 선언해야 밑에 사용가능(프로그램은 위에서 아래로, 왼쪽에서 오른쪽으로 읽기때문)
		
		// 불가능-> int b = a;
		int a = 10;
		int b = a;
		if(a>10) {
			int c = 10;
		} // 자바에서 중괄호는 범위를 뜻함, 안에서 선언된 변수는 안에서만 사용가능
		//불가능-> int d = c;
	}
}