package alone_practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class array1_240906 {

	public static void main(String[] args) {
// total 구하기 ----------------------------------------------------		
//		int [] kor = new int[3];
//		kor[0]=100;
//		kor[1]=200;
//		kor[2]=300;
//		
//		int total = 0;
//		for(int i=0; i<kor.length;i++) {
//			total+=kor[i];
//		}
//		System.out.println("총점 : " + total);
// 날짜,시간,요일 구하기-------------------------------------------------------- 
//		Calendar cal = Calendar.getInstance();
//		System.out.println("현재 날짜 확인");
//		System.out.print(cal.get(Calendar.YEAR)+"년");
//		System.out.print(cal.get(Calendar.MONTH)+1+"월");
//		System.out.println(cal.get(Calendar.DATE)+"일");
//		
//		System.out.println("현재 시간 확인");
//		System.out.println(cal.get(Calendar.HOUR)+"시");
//		System.out.println(cal.get(Calendar.MINUTE)+"분");
//		System.out.println(cal.get(Calendar.SECOND)+"초");
//		
//		String [] yoil= {"일", "월", "화", "수", "목", "금", "토"};
//		System.out.println("현재 요일");
//		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1]+"요일");
//		int yoilNum = cal.get(Calendar.DAY_OF_WEEK)-1;
//		System.out.println(yoil[yoilNum] + "요일");
// 성적1--------------------------------------------------------------------
//		Scanner input = new Scanner(System.in);
//		System.out.println("학생 수를 입력하세요");
//		int su = input.nextInt();
//		
//		int []kor = new int[su];
//		for(int i = 0; i<kor.length; i++) {
//			System.out.println(i +"번 학생의 국어점수를 입력하세요");
//			kor[i]=input.nextInt();
//			
//		}
//		int total = 0;
//		for(int i=0; i<kor.length;i++)
//			total += kor[i];
//		System.out.println("총점 :" + total);
//		System.out.println("평균 :" + total/kor.length);
// 성적2------------------------------------------------------------------------
//		Scanner input = new Scanner(System.in);
//		System.out.println("국어점수를 입력하세요");
//		String scoreString = input.nextLine();
//		
//		StringTokenizer st = new StringTokenizer(scoreString,"/");
//		
//		int score [] = new int[st.countTokens()];
//		System.out.println(score.length);
//		
//		for(int i=0;i<score.length; i++) {
//			score[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		int total = 0;							
//		for(int i = 0; i<score.length; i++) {
//			total +=score[i];
//		}
//		System.out.println("총점 : "+ total);
//		System.out.println("평균 : "+ total/score.length);
// 야구게임----------------------------------------------------------------------
//		int[] baseball = new int[3];
//		
//		for(int i =0; i<baseball.length; i++) {
//			baseball[i]=(int)(Math.random()*10);
//			for(int j=0; j<i; j++) {
//				if(baseball[j] == baseball[i]) {
//					i--;
//				}
//				
//			}
//			
//		}
//		// baseball 값 출력
//		for(int i=0;i<baseball.length;i++) {
//			System.out.print(baseball[i]+" ");
//		}
//		
//		// 사용자 입력값
//		int[] answer = new int[3];
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 3개 입력");
//		String input_str = input.nextLine();
//		StringTokenizer st = new StringTokenizer(input_str);
//		
//		for(int i=0;i<answer.length;i++) {
//			answer[i] = Integer.parseInt(st.nextToken());
//		}
//		// answer 값 출력
//		for(int i=0;i<answer.length;i++) {
//			System.out.print(answer[i] + " ");
//		}
//		// 값 비교
//		int strike=0, ball=0;
//		for(int i=0; i<baseball.length;i++) {;
//			for(int j=0;j<answer.length;j++) {
//				if(baseball[i] == answer[j]) {
//					if(i == j) {
//						strike++;
//					}
//					else {
//						ball++;
//				}
//			
//			}
//		}
//	}
//		System.out.println("스트라이크: " + strike + "/볼:" + ball);
// 로또-------------------------------------------------------------------------
		
	}
		
}
