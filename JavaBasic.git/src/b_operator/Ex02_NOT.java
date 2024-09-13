package b_operator;

/*
 *  not : 결과에 반대로 하는 연산자
 *      -> 일반논리(true/false) not : ! 
 *      -> 이진논리 not : ~
 */
public class Ex02_NOT {
	
	public static void main(String[] args) {
		boolean result = 3 > 4;// 일반논리 not
		System.out.println(result);
		System.out.println(!result);//false를 true로 바꿔주는 연산자 not
		
		int a = 15;// 이진논리 not //00000000 00000000 00000000 00001111
		                         // 맨 앞이 0 : 양수, 1 : 음수 
		System.out.println(a); // a = 15
		System.out.println(~a); //11111111 11111111 11111111 11110000
		
		
	}

}
