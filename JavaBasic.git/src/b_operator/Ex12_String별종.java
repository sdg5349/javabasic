package b_operator;
/*
 *  문자열 처리하는 클래스
 *  	- String
 * 		- StringBuffer / StringBuilder
 */
public class Ex12_String별종 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("홍길동");
		sb.append("바보");
		//sb = sb + "바보"
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("홍길국");
	    sb2.append("바보");
	    System.out.println(sb2);
	    //StringBuffer vs StringBuilder
	    //StringBuilder는 동기화를 보장하지 않는다 하나의 작업이 들어갔을 때 다른 작업은 '락'을 건다
	    
	    
		//String str = new String("홍길자"); 원래는 이렇게 나와야하지만
		String str = "홍길자"; 
		// [String 특권] new 생략가능
		//				연산자 가능
		str = str + "바보"; //= str += "바보";
		System.out.println(str);
	}
}
