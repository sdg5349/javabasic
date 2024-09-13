package b_operator;
import java.util.Scanner;
public class Hw02_큰수출력 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("첫번째->");
	    a = input.nextInt();
	    System.out.println("두번째->");
	    b = input.nextInt();
	    System.out.println("세번째->");
	    c = input.nextInt();
	    
	    int result = (a>b) ? a : b;
	    int result2 = (result>c) ? result : c;
	    System.out.println("세 수 중에서 가장 큰 수는 " + result2);
	}
}
