package b_operator;
import java.util.Scanner;
public class Ex09_삼항복습 {

	public static void main(String[] args) {
		
		//두 수 중에서 큰 수를 출력 
		int a =15, b = 10;
		int max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("두 수 중에서 큰 수는 " + max);
		
		//두 수를 입력받고 그 두 수 중에서 큰 값 출력
		Scanner input = new Scanner(System.in);
		int c, d;		
		System.out.println("c?");
		c = input.nextInt();
		System.out.println("d?");
		d = input.nextInt();
		
		int max2 = (c>d) ? c : d;	
		System.out.println("두 수 중에서 큰 수는 " + max2);	
		
	}
}
