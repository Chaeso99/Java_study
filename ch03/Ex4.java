package ch03;

public class Ex4 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[2]; 
		// System.out.println(arr[2]);
		System.out.println((3>13)&&(arr[2]==0)); //앞이 true든 false든 뒤를 확인하니까 에러가 안남
		//System.out.println((3>13)&(arr[2]==0)); //둘다 true여야 하는데 앞에가 false라서 뒤는 확인안하고 에러나옴
		System.out.println((3>10)|(3>4)); //false
		System.out.println((3>10)||(3>4)); //false
		System.out.println((3>2)^(3>4)); //XOR 하나는 false, 하나는 true여야 true
		System.out.println(!true);//not
	}
}