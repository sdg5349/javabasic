package b_operator;

public class Ex11_종합 {
	public static void main(String[] args) {
		int z = 10 - 7 ^ 3 + 1 * 2 & 4;
//		                       2
//		           3       5
//                       0101      0100  =0100=4
//                 0011       0100
//                       0111
		System.out.println("Z = " + z);
		int i = 5;
		System.out.println(i++); //5
		System.out.println(i++); //6
		
		int a = -5;
		if((a>0) && (++a /3>0)) { // 이미 a>0 이 false이기 때문에 뒤에 코딩 적용하지 않는다
			a++;                  // && -> &으로 바꾸면 일단 모든 식을 다 적용 
			                      // if 변수가 false 일 경우 코딩 적용하지 않고 a값 ++a까지만 계산 
		}
		System.out.println("A=" + a); 
		
	}
}
