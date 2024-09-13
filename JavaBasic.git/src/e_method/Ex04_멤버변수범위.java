package e_method;

public class Ex04_멤버변수범위 {

	static int a = 10, b = 20;
	static int sum = 0; // 본래는 멤버변수는 자동초기화 된다
	
	public static void main(String[] args) {
			
		add();
		System.out.println("합: " + sum);
	}
	
	static void add() {
		sum = a+b;
	}
}
