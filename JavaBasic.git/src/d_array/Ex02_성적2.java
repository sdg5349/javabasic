package d_array;
/*
 * 5명의 국어점수를 입력하세요 (입력예시 : 10/10/10/10/10) -> 55/66/75/69/72
 * 총점은 xxxx이고, 평균은 oooo입니다.
 */
import java.util.*;

public class Ex02_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		String scoreString = input.nextLine(); // "55/66/75/69/72"
		
		StringTokenizer st = new StringTokenizer(scoreString, "/");
		
		int score [] = new int[st.countTokens()];
		System.out.println(score.length); // score.length의 갯수
		
		for(int i=0; i<score.length; i++) {
			score [i] = Integer.parseInt(st.nextToken());
		}
		
		// 총점 구하기 
		int total = 0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
		
		// 총점, 평균 출력
		System.out.println("총점: "+total);
		System.out.println("평균: "+score.length);
		
		
	}

}
