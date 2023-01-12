package ch10;

public class Exception_Ex2 {

	public static void main(String[] args) {
		try 
		{
			int arr[] = new int [3];
			arr[0] = 10;
			arr[1] = 10;
			arr[2] = 10;
			arr[3] = 10;
			System.out.println("실행되나요?");
		} 
		catch (Exception e) 
		{ 
			System.err.println("배열 예외입니다.");
		} 
		finally //예외에 관계없이 무조건 실행(finally가 안들어가는 경우도 있음)
		{
			System.out.println("finally");
		}
	}

}
