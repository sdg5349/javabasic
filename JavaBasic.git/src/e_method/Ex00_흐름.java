package e_method;

public class Ex00_흐름 {

	static void method() {
		System.out.println("method 실행");
		
	}
	public static void main(String[] args) {
	// jvm무조건 자동적으로 main을 순서 상관없이 먼저 불러온다
	// java의 시작은 무조건 main부터 시작한다	
		System.out.println("main 시작");
		method();	// void method로 넘어갔다가 밑에 작동 완료하고 다시 돌아온다
		method();
		method();
		System.out.println("main 끝");

	}
	
	
}
