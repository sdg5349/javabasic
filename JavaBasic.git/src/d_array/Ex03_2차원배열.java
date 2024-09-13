package d_array;

public class Ex03_2차원배열 {

	public static void main(String[] args) {
	
		char [][] alpha = new char[3][4]; // 3줄 4칸
		
		// 값입력
//		for(int i=0; i<alpha.length; i++) {
//			for(int j=0; j<4; j++) {
//				alpha[i][j] = '*'; // 이차원배열
//			}
//			
//		}
		char ch = 'A';
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<alpha[i].length; j++) {
				alpha[i][j] = ch;
				ch++;
			}
		}
		
		// 값출력
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<alpha[i].length; j++) {
				System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}
			
		
	}
}
