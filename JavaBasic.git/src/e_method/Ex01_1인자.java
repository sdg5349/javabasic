package e_method;

/*
 * 인자 - argument
 * 매개변수 - parameter
 * 
 * 인자 := 매개변수
 */

public class Ex01_1인자 {
	
	static void add(int a, int b) { //매개변수 : parameter
		// 데이타에 대한 처리
		int sum = a+b; // 블럭이 연결 되지 않아서 오류가 난다
					   // 인자에서 a, b를 지정하고 매개변수에서 a, b를 잡아줘야 실행가능
		System.out.println("합: "+ sum);
	}
	
	public static void main(String[] args) {
		// 데이타
		int a=10, b=20;
		
		add(a, b); //인자:argument 보내는 애
		

	}		
	
	
}
