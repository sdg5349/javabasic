package a_datatype;





/* 
 * [참고] 자료형
 * 
 *  1. 기본형
 *     논리형 boolean = true or false
 *     문자형 char = 2byte
 *     정수형 int = 4byte   이런 것도 있다 => byte형(1b), short형(2b), long형(8b)
 *     실수형 double = 8byte 이런 것도 있다 => float(4b)
 *     
 * [기본]
 *     변수의 자료형과 값의 자료형이 일치 
 * [참고]          
 *     변수의 자료형과 값으이 자료형이 안 맞는 경우
 *     
 *    '변수의 자료형 > 값의 자료형 = 자동해결
 *    '변수의 자료형 < 값의 자료형 = 자료형 변경(casting)
 *   
 *       
 *    
 *      
 *      
 *      
 *      
 */
public class Ex04_Casting {

	public static void main(String[] args) {
		
		float f;  
		f = 3.14f;
		System.out.println("f=" + f);
		

		double d; // 8b
		d = 100;  // 공간(8b) = 4b값
		System.out.println("d=" + d);
		
		// 정수형변수 i에 36.99실수 대입하고 출력
		int i;
		i = (int)36.99;
		System.out.println("i=" + i);
		
		int su;
		//su = 10000000000;
		
		long big;
		big = 10000000000L;
        System.out.println("큰수" + big);		
		
		
		
	}

}
