package b_operator;

public class Ex03_나머지 {
	
	public static void main(String[] args) {
		
		//나머지 연산자 활용 : 홀/짝수 구할 때
		int a = 10;
	    int b = 12;
		if(a % 2 == 0) { //a를 2로 나눴을 때 나머지가 0이라면
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		if(b % 3 == 0) {
			System.out.println("3의 배수다");
		}else {
			System.out.println("3의 배수아니다");
		}
		// 숫자 하나는 입력받아 해당하는 숫자가 3의 배수인지 여부 출력
		if(b % 4 == 0) {
			System.out.println("4의 배수다");
		}else { 
			System.out.println("4의 배수아니다");
		}
	}

}
