package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Ex3 
{
	public static void main(String[] args) 
	{	Scanner s = null;
		
		try 
		{
			int a, b;
			s= new Scanner(System.in);
			System.out.print("첫번째 숫자: ");
			a = s.nextInt();
			System.out.print("두번째 숫자: ");
			b = s.nextInt();
			System.out.println(a+ "/" +b+ "="+(a/b));
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("0으로 나누면 안되요");
		}
		catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}
		finally
		{
			s.close(); //사용후에 반드시 닫아야 한다.
		}
	}
}