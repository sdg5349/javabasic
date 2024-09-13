package e_method;

// call by value : 메소드의 인자(파라메터)가 기본형인 경우
//					=> 값만 복사 : static void add() 의 값이 
//           				     원본인 main 에 영향을 미치지 않는다					
public class Ex06_CallByValue {

	public static void main(String[] args) {
	
		int a=10, b=20;
		add(a, b);
		System.out.println("2. A="+a+",B="+b);
		
	}
	static void add(int a, int b) { //int 기본형으로 넘어가는 것 = call by value	
		
		a +=b; // a=a+b; // 기본 연산자 + - 사용 가능
		System.out.println("1. A="+a+",B="+b);
		
		
	}
}
