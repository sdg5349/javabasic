package a_datatype;

public class Ex06_String {
	/*
	 * 
	 * 
	 * [주의] String 이름으로 클래스 명 지정하면 안된다
	 * 
	 * [데이타 타입 - 자료형]
	 * 1. 기본형
	 * 2. 참조형 : 배열, 클래스(String은 자바가 제공하는 클래스)
	 *      -> 참조형은 반드시 new 예약어로 메모리 확보를 해야 한다. 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {//String은 자바가 제공해주는 것
		
		int age = 30;
		//[1단계] 클래스 변수 선언
		//[2단계] 메모리 확보
		String name;
		name = new String("홍길동");//new 라는 메모리에 잡히면 
		
		String name2 = new String("홍길동");
		//name2 라는 변수는 new를 만나서 새로운 주소값을 갖게 된다
		//그 주소값에 "홍길동"이라는 주소값이 들어가 있다.
		//즉 name2 -> 10000 -> "홍길동"
		
		if(name.equals(name2)) {// name 변수의 값과 name2 변수의 값이 같다면 "이름이 같다" 출력 
		// = if(name == name2)	 
			System.out.println("이름이 같다");
		}else { // 그렇지 않다면 "이름이 다르다" 출력
			System.out.println("이름이 다르다");
		}
		//String 은 참조형으로 엄밀히 말하면 "이름이 같다"가 아닌 "주소가 같다"
		
	}

}
