package c_control;
/*
 * break : 블럭을 벗어나는 문장
 * continue : 블럭의 끝으로 이동하는 문장
 * 
 */

public class Ex10_BreakContinue {

	public static void main(String[] args) {
		
//		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
//				if(j == 1) break; //continue;
//				System.out.printf("<%d , %d> \n" , i, j);
//		

		
//			if(j == 1) break;//break를 통해서 반복문을 끝내게 된다 -> j = 2일 경우 실행불가
			                 //break로 인해서 중괄호 밖으로 이동
			if(j == 1) continue;//continue는 반복은 계속되나 해당 변수에서 괄호 안의 코드만 뛰어넘는다
			System.out.printf("<%d> \n" , j);
//		END : //i 전체가 break
//		for(int i = 0; i<2; i++) {
//			for(int j = 0; j<3; j++) {
//				if(j == 1) break END; //continue;
//				System.out.printf("<%d , %d> \n" , i, j);
//		}
//		END : //i 전체가 break
//			for(int i = 0; i<2; i++) {
//				for(int j = 0; j<3; j++) {
//					if(j == 1) continue END;//break END; //continue;
//					System.out.printf("<%d , %d> \n" , i, j);
//			}
		}
		System.out.println("데이타");
	}
}
