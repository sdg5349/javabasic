package c_control;

import java.util.Scanner;

public class Ex06_for_중첩숫자사각형 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력");
		int row = input.nextInt(); //3 입력
		int col = input.nextInt(); //4 입력
		
		
		int su =1;//숫자 출력하는 변수
		
		
		//이중 for문
		for(int i=0; i<row ; i++) {//i 0 1 2 row는 3줄 
			for( int j=0; j<col ; j++ ) {//j 0 1 2 3 col은 4칸
				System.out.print(su + " ");
				su++;//출력을 하고 나서 수가 하나씩 증가할 것이다
			}
			System.out.println();
		}
//		------------------------------------------------------------------
//		//위 코드와 같다 방식을 줄인 것
//		for(int i=0,su=1; i<row ; i++) {//i 0 1 2 row는 3줄 
//			for( int j=0; j<col ; j++,su++ ) {//j 0 1 2 3 col은 4칸
//				                              //줄이려면 이렇게 들어가는 위치에 ,하고 넣어도된다
//				System.out.println(su + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1; i<row; i++) {
//			for(int j=1; j<col; j++) {
//				System.out.print(i*j + " ");
//			}
//		}
//		System.out.println();
//		
//		
		
	}

}
