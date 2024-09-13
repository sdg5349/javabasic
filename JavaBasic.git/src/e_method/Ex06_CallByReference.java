package e_method;

// call by reference : 메소드의 인자(파라메터)의 자료형이 참조형인 경우
//					   => 주소만 복사
//					   => 원본에 영향을 미친다
public class Ex06_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("2. A="+a+",B="+b);
	}
	public static void add(StringBuffer a, StringBuffer b) {
		a.append(b); // StringBuffer 는 기본 연산자를 쓸 수 없어서 함수 사용
		System.out.println("1. A="+a+",B="+b);
	}
}
