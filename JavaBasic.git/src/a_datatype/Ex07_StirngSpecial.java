package a_datatype;

/*
 * String : 클래스임(참조형)
 *  -> 참조형은 무조건 new 연산자로 메모리 확보해야함
 *  -> 단, 하나 String 특권으로 new 생략해도 됨 -> 값이 같을 경우에만 사용?
 *  
 *  
 */

public class Ex07_StirngSpecial {
	
	public static void main(String[] args) {
		
		//String name;
		//name = new String("홍길동");//new 라는 메모리에 잡히면 
		//String name2 = new String("홍길동");
		//원래라면 이렇게 해야하지만 String 은 new 를 안써도 되므로
		
		String name = new String("홍길동");
		String name2 = "박길동";
		
		if(name.equals(name2)) {// 문자열 갑을 비교한다면? 
				System.out.println("이름이 같다");
		}else { // 그렇지 않다면 "이름이 다르다" 출력
				System.out.println("이름이 다르다");
		}
		
	}

}
