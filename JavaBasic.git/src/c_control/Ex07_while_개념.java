package c_control;

import java.util.Scanner;

public class Ex07_while_개념 {

	public static void main(String[] args) {
		
/*
 * 반복문 - for문/ While문/ do~while문 
 * 		  for문(초기치; 조건문; 증가치){
 * 			반복문장;
 * 			}
 * 
 * 		  초기치;
 * 		  while문(조건문){
 * 			반복문장;
 * 			증가치;
 * 			}		
 */

//		int sum = 0; //sum이라는 변수를 잡고 초기화
//		for( int i=1;i<=10 ;i++ ) {
//			sum += i;//1부터 10까지 합산
//			
//		}// end of for - i
//		System.out.println("합 : " + sum);
		//-----------------------------------------------------
//		int sum = 0; //sum이라는 변수를 잡고 초기화
//		int i = 1;
//		for( ;i<=10 ;) {
//			sum += i;//1부터 10까지 합산
//			i++ ;
//		}// end of for - i
//		System.out.println("합 : " + sum);
		//-----------------------------------------------------
		//while문은 조건문만 가지고 있는 것 
		int sum = 0; //sum이라는 변수를 잡고 초기화
		int i = 1;
		while( i<=10 ) {
			sum += i;//1부터 10까지 합산
			i++ ;
		}// end of for - i
		System.out.println("합 : " + sum);
		//-----------------------------------------------------
		//단 수를 입력받아서 구구단을 출력해라
		Scanner input = new Scanner(System.in);
		System.out.println("단 입력");
		int dan = input.nextInt();
		//ex) 2*1=2 ... 2*9=18
		//반복 1~9번 구동하는 코드만들기
		
		//for(int i=1;;i<=9;i++;) { //for문으로 만들면
		//while문으로 만들면	
		int i=1;
		while(i<=9) {
			i++;
			System.out.printf(" %d * %d = %d\n", dan, i, dan*i);//printf는 형식을 만드는 것
		}
		
		
	}//end of main
}//end of class
