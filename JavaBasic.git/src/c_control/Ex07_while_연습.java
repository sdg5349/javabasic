package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {
		
		// 숫자를 여러개 입력 받아 가장 큰 수 구하기 ex) 3 9 12 4 33 20 11 19
		// 한꺼번에 입력 받아서 풀 수 있는 SrtingTokenizer
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력 (1 2 3 4) ->");
		String str = input.nextLine(); //문자열 "1 2 3 4"
		
		StringTokenizer st = new StringTokenizer(str);
		
		int max = 0;// int max = st.nextToken();이걸로 해도 되지만 
				  //문자열 -> 숫자로 또 변환해야한다	
		//횟수를 정확하게 모르는 경우
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);//token은 문자열
			//int su = token;//int는 기본형 String은 참조형 
			int su = Integer.parseInt(token);//String 문자열 -> 숫자로 변환하기 위해서 사용
			if(max<su) max = su;
		}
			System.out.println("큰 수 :" + max);
//		--------------------------------------------------------------------	
//			Scanner input = new Scanner(System.in);
//			System.out.println("숫자 입력 (1 2 3 4) ->");
//			String str = input.nextLine();
//			
//			StringTokenizer st = new StringTokenizer(str);
			//StringTokenizer를 사용하여 문자열 str을 공백을 기준으로 분리합니다. 
			//이 객체는 문자열을 토큰으로 나누는 데 사용됩니다.
			
//			int odd=0, even=0;
//			//odd와 even 변수를 초기화하여 각각 홀수와 짝수의 개수를 셀 준비를 합니다. 
//			//둘 다 0으로 초기화합니다.
//			while(st.hasMoreTokens()) {
//				//while(st.hasMoreTokens()) 루프를 사용하여 
//				//StringTokenizer가 더 많은 토큰을 가지고 있는 동안 반복합니다.
//				String token = st.nextToken(); 
//				//각 토큰을 st.nextToken()을 통해 얻고, 이를 문자열 token에 저장합니다.
//				int su = Integer.parseInt(token);
//				if(su%2 == 0) even++;
//				else odd++;
//				//변환된 정수 su가 짝수인 경우(su % 2 == 0) even 변수를 증가시키고, 
//				//홀수인 경우에는 odd 변수를 증가시킵니다.
//			}
//			System.out.println("짝수 " + even + "개");
//			System.out.println("홀수 " + odd + "개");
				
			
	}
		
		
}
