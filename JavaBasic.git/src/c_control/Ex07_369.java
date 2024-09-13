package c_control;

public class Ex07_369 {
//	이 코드는 1부터 50까지의 숫자를 출력하면서 3, 6, 9가 포함된 숫자는 "짝"으로 대체하여 출력
//	369 게임으로 숫자에 3, 6, 9가 포함될 때 "짝"으로 출력

	public static void main(String[] args) {
		
		
		for(int i=1; i<=1000; i++) {
//		for 사용하여 1부터 50까지의 숫자를 반복합니다.		
			int su = i;
//			su 변수에 현재 숫자 i를 저장합니다.
			boolean su369 = false;
//			su369 변수는 현재 숫자에 3, 6, 9가 포함되어 있는지를 확인하기 위한 플래그입니다. 
//			초기값은 false로 설정됩니다.	: if문에 걸렸는지 안걸렸는지 확인할 것		
			while(su!=0) {
//			while(su != 0)를 사용하여 su가 0이 될 때까지 반복합니다. su가 0이 아닌동안 반복한다
				int na=su%10;
//          na 변수는 su 10으로 나눴을 때 나머지룰 이용해 오른쪽 자리수를 가져옵니다 (su % 10).			
				if(na == 3 | na == 6 | na== 9 ) {
					System.out.print("짝");
					su369 = true;
//					na가 3, 6, 9 중 하나일 경우 "짝"을 출력하고, su369를 true로 설정합니다.
				}
				su = su /10 ; 
//				su를 10으로 나누어 몫을 가져 오므로 가장 오른쪽 자릿수를 제거합니다 (su = su / 10).
			}
			if(!su369)System.out.println(i);
//			su369가 false일 경우, 즉 현재 숫자에 3, 6, 9가 포함되지 않았을 경우 숫자 i를 출력합니다.
			else System.out.println();
//			su369가 true일 경우, 즉 현재 숫자에 3, 6, 9가 포함된 경우에는 
//			빈 줄을 출력하여 "짝"으로 대체된 숫자를 출력하지 않습니다.
			
		}
	}
}
