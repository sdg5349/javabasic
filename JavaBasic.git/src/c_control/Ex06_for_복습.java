package c_control;

import java.util.Scanner;

public class Ex06_for_복습 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자(su) 입력");
		
		//3행 3열 별표 찍는 모양을 먼저 만든다
		
		int su = input.nextInt(); //숫자 입력
		
		for(int i = 0;i<su;i++) {//su만큼 i++할 것이다 //row(행)
			//공백을 추가
			for(int j =0;j<su-i-1;j++) {
				System.out.print(' ');
			}
			for(int j =1 ; j<=i+1;j++) { //column(열)
				System.out.print(j);//행3열에 *로 채울 것이다
			}
			System.out.println();//3행3열을 만든후 공백을 만들어야한다
		}
	}

}
