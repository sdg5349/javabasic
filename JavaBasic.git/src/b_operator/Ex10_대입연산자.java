package b_operator;

public class Ex10_대입연산자 {
	public static void main(String[] args) {
/*
 *  대입연산자 축약 = 산술, 쉬프트, 이진논리
 *  
 *  a = a + b; -> a+=b; //개발자들은 보통 뒷 패턴으로 산술 작성
 *  a = a - b; -> a-=b;
 *  a = a * b; -> a*=b;
 * 	a = a / b; -> a/=b;
 *  a = a % b; -> a%=b;	
 *  
 */
		int a = 10, b = 7;
		a+=b;
		System.out.println("+= 결과 : " + a);
		a-=b;
		System.out.println("-= 결과 : " + a);//위 코딩으로 인해 이미 a가 17로 바뀐 상태
		a*=b;
		System.out.println("*= 결과 : " + a);
		a/=b;
		System.out.println("/= 결과 : " + a);
		a%=b;
		System.out.println("%= 결과 : " + a);
	}
}
