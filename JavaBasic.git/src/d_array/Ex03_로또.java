package d_array;

public class Ex03_로또 {

	public static void main(String[] args) {

		int [][]lotto = new int [5][6];

		// 값입력
		for(int i=0; i<lotto.length; i++) {
			DASI:for(int j=0; j<lotto[i].length; j++) {
				lotto[i][j] = (int)(Math.random()*45)+1; // 이차원배열
				for(int k=0; k<j; k++) {
					if(lotto[i][j] == lotto[i][k]) {
						j--;
						//break;
						continue DASI;
					}
				}

			}

		}
		// 값출력
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length; j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}




	}

}
