package b_operator;

/*
 *  shift : 모든 비트의 값을 이동하는 연산자(이런애가 있다라고 알아두자)
 *  >> 
 *  << 
 *  >>>
 *  숫자 2를 1byte에다 적용한다면? 0000 0010(2진수 숫자2)
 *  2<<1 (왼쪽으로 한칸씩 이동하세요) 0000 0100
 *  2>>1 (오른쪽으로 한칸씩 이동하세요) 0000 0001
 *  
 *  C언어, Java만 가지고 있는 특성
 *  2>>>1 음수인 경우 1000 0010 -> 0100 0001 
 */

public class Ex04_쉬프트연산자 {

	public static void main(String[] args) {

		int a = 4;  // 000000000 00000000 000000000 00000100 = 4
		int result = a >> 2; //000000000 00000000 000000000 00000001 = 1
		System.out.println("a>>2 한 결과 :" + result);
		
		//정수형 변수 result 2를 만들어라
		int result2;
		result2 = a << 2;
		System.out.println("a<<2 한 결과 :" + result2); // 000000000 00000000 000000000 00010000 = 16
		//이렇게도 쓸 수 있다
		//int result2 = a << 2;
		//System.out.println("a<<2 한 결과 :" + result2);
		
		int b = -4;
		int re1 = b >> 2;
		System.out.println("b >> 2 한 결과 :" + re1);
		
		int re2 = b >>> 2; //결과 값이 양수가 된다
		System.out.println("b >>> 2 한 결과 :" + re2);
		
		
	}

}
