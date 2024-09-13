package a_datatype;

/*
 * [참고]
 * 
 *              9 : 숫자 9
 *              '9' : 문자 9
 *              "9" : 문자열 9
 * 
 * 
 * 
 */
public class Ex02_Valuavle {
	
	public static void main(String[] args) {
		//---------------------------------
		//[1] 변수를 선언 
		char testCh;           // 문자변수 testCh 선언
		                        // *정수형변수 jungsu 선언
		double silsu;            // * 실수형변수 silsu 선언
		                         
		
		int jungsu;
		                         // * 논리형변수 ok 선언
		boolean ok;
		
		//----------------
		//[2] 값을 지정(대입)
		testCh = '깡';        // testch 변수에 '깡' 문자 지정(대입, 저장)
		jungsu = 10000;                       // * jungsu 변수에 10000 숫자 지정
		
		             silsu = 3.6;                 // * 선언한 실수형 변수에 3.6저장
		             
		                                          // * ok변수에 참(true) 지정(저장)
		             ok = true;
		             
		             
		//-----------------
		//[3] 출력
		System.out.println("문자변수:" + testCh);
		                 // * jungsu 변수 출석
		System.out.println("정수변수:" + jungsu);
		                   // * 선언한 실수형 변수를 출력
	    System.out.println("실수변수" + silsu);
		System.out.println(ok);
		
		
		
		
		 
	}

}





        
