package e_method;

public class Ex06_CallByString {

	public static void main(String[] args) {
		String a = new String("안녕");
		String b = "하이"; // String 은 유일하게 new 안써도 가능
		
		add(a, b);
		
		// String 도 원본에 영향을 미치지 못한다
		// String 은 내용이 한번이라도 바뀌면 메모리를 새로 잡는다
		// static void add 쪽에서 "안녕하이"로 값이 바뀌면
		// 1000번지의 안녕을 잡는 것이 아니라 새로운 9999번지의 안녕하이를 잡은 것
		// 그렇기 때문에 String 을 사용하면 새로운 주소들이 많이 생긴다
	    // 따라서 내용이 변하는 코딩에 있어서는 StringBuffer 를 사용한다
		System.out.println("2. A="+a+",B="+b);
	}
	
	static void add(String a, String b) {
		a += b; // String 은 별종이기 때문에 기본 연산자 사용 가능
		System.out.println("1. A="+a+",B="+b);
	}
}
