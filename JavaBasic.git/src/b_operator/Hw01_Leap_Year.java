package b_operator;

import java.util.Scanner;
public class Hw01_Leap_Year {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("연도를 입력하시오.");
		int year = input.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			//해당 연도를 4로 나눈 나머지 값이 0인 것 포함 
			//100으로 나눈 나머지 값이 0인 것은 제외 
			//400으로 나눈 나머지 값이 0인 것은 포함
			
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		}
	}
}
