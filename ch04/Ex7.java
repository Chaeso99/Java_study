package ch04;

public class Ex7 
{
	int asd;
	public static void main(String[] args) 
	{
		//for문을 이용해서 1~10까지의 합을 구하시오
		int sum = 0;
		//3항 연산자처럼 값이 3개 들어간다. 맨앞에는 변수 선언이 들어감(보통 하나인데 여러개도 가능), 두번째는 반복조건이 들어가는 영역(true, false값)
		//, 3번은 값의 변화가 들어감 1번-2번-4번-3번-2번-4번-3번-2번-4번 식으로 로테이션이 돔(중괄호 안이 4번영역)
		for(int i=1, j=0;i <11; i++, j++) 
		{
			sum = sum + i;
		}
		System.out.println("sum : "+sum);
		int j = 0; //for문 안의 중괄호 영역과 여기 영역이 달라서 같은이름 변수도 사용가능
		for(;j<11;j++)//앞에 j가 선언및 초기화 되어 있으므로 첫번째 칸에 값이 안들어가도 됨
		{
			System.out.println("j : "+ j);
		}
		for(;;)
		{
			System.out.println("무한반복");
		}
		//System.out.println("끝"); //위에서 무한반복이 돌아서 안끝나기 때문에 여기까지 안옴-논리적 에러
	}
}