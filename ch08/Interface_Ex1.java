package ch08;

interface Calc{
	void plus(int a, int b); //자동으로 추상메서드가 됨
}

class Function implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

class Graphics implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

public class Interface_Ex1 {

	public static void main(String[] args) {

	}

}
