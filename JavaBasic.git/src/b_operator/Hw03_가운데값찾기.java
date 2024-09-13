package b_operator;
import java.util.Scanner;
public class Hw03_가운데값찾기 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println();
		a = input.nextInt();
		System.out.println();
		b = input.nextInt();
		System.out.println();
		c = input.nextInt();
		
		int middle;
		
		if ((a >= b && a <= c) || (a <= b && a >= c)) {
            middle = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            middle = b;
        } else {
            middle = c;
        }
		//if(a>b & a>c) {}
	    //int result = (a>b) ? a : b;
	    //int middle = (result<c) ? result : ((c>b) ? c : b) ;
	    System.out.println("가운데 값은 " + middle);
	}
}
