package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_야구게임 {

	public static void main(String[] args) {
		
		// 1. 임의의 수 3개 baseball에 저장
		int [] baseball	= new int[3];
		
		for(int i = 0; i<baseball.length ; i++) {
			baseball[i] = (int)(Math.random()*10);
			//  0부터 9까지의 랜덤 숫자를 생성하여 배열의 i번째 위치에 저장
			for(int j=0; j<i; j++) {
				if(baseball[j] == baseball[i]) {
					i--;
				}
			}
			
			//System.out.println(baseball[i] + "/");
						
		}
		// baseball 값 출력
		for(int i = 0; i<baseball.length ; i++) {		
			System.out.print(baseball[i] + " ");
		}
		//--------------------------------------------------
		// 2. 사용자 입력값 answer 에 각각의 숫자로 저장
		// ex) 3 4 5 
		int []answer = new int[3];
		
		// 구문작성
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력 (1 2 3)->");
		String input_str = input.nextLine();
		StringTokenizer st = new StringTokenizer(input_str);
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		
//		// answer 값 출력
//		for(int i=0; i < answer.length; i++) {
//			System.out.print(answer[1] + " ");
//		}
		
		// 3. 값비교
		int strike=0, ball=0;
		for(int i=0; i<baseball.length; i++) {
			for(int j=0; j<answer.length; j++)
				if( baseball[i] == answer[j]) {
					if(i==j) strike++;
					else ball++;
					
		
			}	
		}
	
		// 4. 출력
		System.out.println("스트라이크:" + strike + "/볼:" + ball);
	}
}
