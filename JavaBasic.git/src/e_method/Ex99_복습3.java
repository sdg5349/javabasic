package e_method;

import java.util.Scanner;

public class Ex99_복습3 {

	public static void main(String[] args) {
		char[][] ch = input();
		output(ch);
	}
	
	/*
	문자 배열에 저장된 문자들을 화면에 출력한다.
	*/
	static void output(char[][] ch) {
		for(int i=0; i<ch.length ;i++) {
			for(int j=0; j<ch[i].length; j++) {
				System.out.print(ch[i][j] + " ");
			
				}
			System.out.println();
		}
		
			
	}

	/*
	두 정수와 알파벳 문자 하나를 입력받는다
	[예] 3 4 F
	*/	
	static char[][] input() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수1");
		int num1 = input.nextInt();
		System.out.println("정수2");
		int num2 = input.nextInt();
		System.out.println("알파벳");
		char alpha = input.next().charAt(0);
				
		char[][] ch = makeSquare(num1, num2, alpha);
		return ch;
	}
	
	// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	//		입력받은 문자를 시작으로 저장한다. 
	/*
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 */
	static char[][] makeSquare(int num1, int num2, char alpha) {
		 char [][] ch = new char[num1][num2];
		 
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				ch [i][j] = alpha;
				alpha++;
			}
			
		}
		return ch; // return : 제어권을 반환
		
	}

}