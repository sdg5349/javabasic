package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * for문 : 반복횟수가 정해져 있는 경우 주로 사용
 * while문 : 반복횟수를 모르는 경우 주로 사용
 * 
 */

public class Ex07_while_응용 {

	public static void main(String[] args) {
		
		//ex) 국어/영어/수학 입력하라 -> 90/88/70
		Scanner sc = new Scanner(System.in);
		System.out.println("ex) 국어/영어/수학(90/88/70)->");
		String str = sc.nextLine(); // 입력 값을 str에 입력
		//System.out.println(str);
		StringTokenizer st = new StringTokenizer(str, " "); //(문자열,구분자) 구분자의 기본값 : 공백
		
		while(st.hasMoreTokens()) { // 
			String token = st.nextToken();
			System.out.println("점수: " + token);
		}
	}
}
//		}-------------------------------------------------
//		int cnt = st.countTokens();
//		//반복횟수 알 수 있다면
//		for(int i=0; i<cnt ; i++) {//countTokens():토큰의 갯수
//			String token = st.nextToken();
//			System.out.println("점수:" + token);
//		
//		int i = 1;
//		while(i++<3)
//			for(int i = 1;i++<3;)
//			System.out.println(i);
//		
//		
//		
//	}
//
//}
