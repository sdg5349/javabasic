package b_operator;
import java.util.Scanner;
public class Hw02_큰수출력2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println();
		a = input.nextInt();
		System.out.println();
		b = input.nextInt();
		System.out.println();
		c = input.nextInt();
		
		if(a>b & a>c) {
			System.out.println("세 수 중에서 가장 큰 수는 " + a);
		}else if(b>a & b>c) {
			System.out.println("세 수 중에서 가장 큰 수는 " + b);
		}else  {
			System.out.println("세 수 중에서 가장 큰 수는 " + c);
		}
		
	
	}
}
