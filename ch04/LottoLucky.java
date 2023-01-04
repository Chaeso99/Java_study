package ch04;

import java.util.Arrays;
import java.util.ArrayList;

public class LottoLucky 
{

	public static void main(String[] args) 	
	{
		int lotto[] = getLotto();
		for(int i = 0; i <lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}
	
	public static int[] getLotto() 
	{
		int lotto[] = new int[6];
				//배열 밑에는 항상 for문이 있다.
				//중복방지 로직 추가하기-첫번째는 그냥 뽑고, 두번째부터 중복이면 값을 마이너스 해서 다시 루프를 돌리는 방법
				//중복확인은 앞의 방들을 체크해서 같은 번호가 있으면 isNumThere을 true로 만듬, i값을 줄이므로 중복된 회차의 뽑기를 다시 실행
				boolean isNumThere = false;
				
				for (int i = 0; i < lotto.length; i++) 
				{
					isNumThere = false;
					lotto[i] = (int)(Math.random()*45)+1; //1~45
					
					for(int j = 0;j < i; j++)
					{
						if(lotto[i]==lotto[j])
						{
							isNumThere = true;
						}
					}
					if(isNumThere)
					{
						i--;
					}
				}
		Arrays.sort(lotto);//올림차순 정렬
		return lotto;
	}
}