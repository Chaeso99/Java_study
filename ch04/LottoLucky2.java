package ch04;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;

public class LottoLucky2 
{
	
	public static void main(String[] args) 	
	{
		Object lotto[] = getLotto();
		for(int i = 0; i <lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}
	
	//자료구조: Collection 기능- TreeSet이라는 중복방지, 자동 올림차순 정렬 클래스 이용
			public static Object[] getLotto()
			{
				TreeSet<Integer> tr = new TreeSet<Integer>();
				for (int i = 0; tr.size() < 6; i++) 
				{
					tr.add((int)(Math.random()*45)+1);
				}
				Object lotto[] = tr.toArray();
				return lotto;
			}
}