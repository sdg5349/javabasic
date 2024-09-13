package e_method;

import java.util.Scanner;

public class Ex07_연습 {

	public static void main(String[] args) {
		
		int [] score = input();
		double avg = calculate(score);// 계산을 하는 함수 calculate
		output(avg);
	}
	// 국, 영, 수 점수를 입력받기
	static int [] input() { //void -> int []
		
		int [] score = new int[3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수->");
		score[0] =input.nextInt();
		System.out.println("영어점수->");
		score[1] =input.nextInt();
		System.out.println("수학점수->");
		score[2] =input.nextInt();
		
		return score;
	}
	// 입력 받은 점수들로 총점/평균 구해서 출력
	static double calculate(int [] score) {
		//int total = kor + eng + math 이렇게 쓸 수 없다 메모리가 리셋되기 때문에
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
			avg = total / (double)3;
		System.out.println("총점: " + total + ", 평균: " + avg);
		 
		return avg;
	}
	// 평균값을 받아서 학점을 구하여 출력
	static void output(double avg) {//평균은 double avg 를 가져와야한다
		switch((int)avg/10) {// swich 는 정수 int 문자 char 만 가능하기 때문에 int 로 형변환
		case 10:
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B학점"); break;
		default: System.out.println("F학점");
		}
		
	}
	
}
