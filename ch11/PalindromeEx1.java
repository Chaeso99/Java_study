package ch11;

class GetPalindrome {
	int pd1 = 0;
	int pd2 = 0;
	int noD = 1;
	int strnum, rstrnum = 0;

	void getPD10(int n) {
		for (int i = 0; i < n; i++) {
			if (i < 10) // i가 일의자리 수면 대칭수이므로 정답에 더하기
			{
				pd1 = pd1 + i;
			} else // i가 십의자리 이상의 수면
			{
				String str = Integer.toString(i); // 정수 i를 문자열로 변환
				String rstr = new StringBuffer(str).reverse().toString(); // 문자열 뒤집기
				strnum = Integer.valueOf(str);
				rstrnum = Integer.valueOf(rstr);
				if (strnum == rstrnum) // 뒤집은 문자열이 같으면 대칭수이므로 정답에 더하기
				{
					pd1 = pd1 + i;
				}
			}
		}
		System.out.println("10진법의 대칭수의 합:" + pd1);
	}
	
//	void getPD2(int n) {
//		for (int i = 0; i < n; i++) {
//			String str =Integer.toBinaryString(i);//이진수 문자열로 바꾸기
//			String rstr = new StringBuffer(str).reverse().toString(); // 문자열 뒤집기
//			strnum = Integer.valueOf(str);
//			rstrnum = Integer.valueOf(rstr);
//			if (strnum == rstrnum) // 뒤집은 문자열이 같으면 대칭수이므로 정답에 더하기
//			{
//				pd2 = pd2 + i;
//			}
//		System.out.println("2진법의 대칭수의 합:" + pd2);
//	}
}

public class PalindromeEx1 {

	static final int MAX = 100000; 
	
	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다.
		 *   대칭수(palindrome)인 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
        */
		//대칭수 판별 방법-1. 몇자리 숫자인지 확인 2.n%10을 통해 아래자리 숫자 추출 3.추출한 숫자와 역순으로 숫자 배치 4.두 수가 같은지 비교
		GetPalindrome GPd = new GetPalindrome();
		
		//문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		GPd.getPD10(MAX);
		//문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		//GPd.getPD2(MAX);
		//문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
	}
}
