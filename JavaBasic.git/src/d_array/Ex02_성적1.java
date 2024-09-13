package d_array;
/*
 * 학생 수를 입력하세요 -> 5
 * 
 * 0번 학생의 국어점수를 입력하세요 -> 88
 * 1번 학생의 국어점수를 입력하세요 -> 78
 * 2번 학생의 국어점수를 입력하세요 -> 55
 * 3번 학생의 국어점수를 입력하세요 -> 60
 * 4번 학생의 국어점수를 입력하세요 -> 40
 * 
 * 
 * 
 */
import java.util.*;

public class Ex02_성적1 {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int su = input.nextInt();
		
		int []kor = new int[su];
		// Java에서 배열을 생성하는 코드 
		// 여기서 kor는 정수를 저장할 수 있는 배열이며, 배열의 크기는 su 로 설정 
		
		for(int i=0; i< kor.length; i++) {
			System.out.println(i + "번 학생의 국어점수를 입력하세요 ->");
			kor[i] = input.nextInt();
		}
		
		// 총점 구하기
		int total = 0;
		for(int i=0; i<kor.length; i++)
			total += kor[i];
		
		// 총점, 평균 출력
		System.out.println("총점: "+total);
		System.out.println("평균: "+total/kor.length);
					
		
		
		
	}
}

