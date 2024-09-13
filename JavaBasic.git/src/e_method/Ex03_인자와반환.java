package e_method;

public class Ex03_인자와반환 {

	public static void main(String[] args) {
		// 데이타 
		int a=10, b=20;
		int sum = add(a, b);
		// 결과
		System.out.println("합: " + sum);
		
	}

	static int add(int a, int b) {
		// 데이타 처리
		int sum = a+b;
		return sum;// 리턴을 할 때 딱 하나의 값을 가져갈 수 있다	
	}
}
