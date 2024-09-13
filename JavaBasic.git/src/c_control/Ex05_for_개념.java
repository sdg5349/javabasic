package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {
		
//		for(int a=0 ; a<3 ; a++ ) {//for문의 기본구조 a=0이어야 들어올 수 있음
//			//메모리상 a를 0으로 지정 -> 3보다 작으면 -> syso 수행 -> 그다음 a++ 수행
//			//0으로 시작했을 때 a++ = 1 
//			//다음 1로 수행했을 때 a++ = 2
//			//다음 2로 수행했을 때 a++ = 3
//			//다음 3으로 수행했을 때 false -> 반복을 멈추게 된다 
//			//결과적으로 a= 0, 1, 2 
//			System.out.println(a);
//		}	
//		---------------------------------------------------------------
		//for 문은 변수를 for 안에 쓰는게 아닌 밖에서 변수 지정한다
//		int result = 0;
//		for(int a=1 ; a<=10 ; a++) { //a를 10까지 지정하고 싶을 때
//			result = result + a; 
//			// a :      1 2 3  4  5  6  7  8  9 10 
//  		// result : 1 3 6 10 15 21 28 36 45 55
//		for(char ch = 'A'; ch<'Z' ; ch++ ) { //문자형 변수 ch 초기값을 대문자로 지정
//			System.out.print(ch);//println에서 ln제거 : 개행하지 않는다
//				}
//		for(char ch = '가'; ch<='힣'; ch++) {
//		    System.out.print(ch);
//		for(int a=10 ; a>0 ; a=a-2) {//정수형 변수 a에서 2개씩 빼고싶다
//			System.out.println(a);
//		}
//		for(char ch = 'Z'; ch>='A'; ch--) {
//			System.out.println(ch);
//		----------------------------------------------------------------
		int odd = 0, even = 0;
		for(int i=1;i<=10;i++) {//1부터 10까지
			if(i%2 == 0) {
				even += i;//짝수의 합
			}else {
				odd += i;
			}
		}
		System.out.println("홀수의 합: " + odd); //홀수면 odd에다가 누적
		System.out.println("짝수의 합: " + even); // 짝수면 even에다가 누적
		
		for(int i=1; i<=10; i+=2) {//나머지가 아닌 이런 식으로 할 수 도 있다
			odd += i;
			even +=(i+1);
		}
		System.out.println("홀수의 합: " + odd); //홀수면 odd에다가 누적
		System.out.println("짝수의 합: " + even); // 짝수면 even에다가 누적
	}
}
