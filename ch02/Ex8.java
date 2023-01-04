package ch02;

public class Ex8 {

	public static void main(String[] args) 
	throws Exception{
		System.out.println("키보드를 입력하고 Enter 하세요.");
		while(true) {
		int keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		if(keyCode==113) {
			break;
		}
		}// --while(true) 이므로 값이 true면 계속 반복(false면 중단)
	System.out.println("종료");	
	}
}