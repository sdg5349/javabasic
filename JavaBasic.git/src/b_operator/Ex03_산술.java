package b_operator;

/*
 *  산술연산자 : + - * / %
 *  
 */
import java.util.Scanner;
public class Ex03_산술 {
	
	public static void main(String[] args) {
		/*
		 * 콘솔 창에서
		 * 첫번째 숫자입력 -> ex) 20
		 * 두번째 숫자입력 -> ex) 15
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째숫자입력");
		int a = input.nextInt();
		
		System.out.println("두번째숫자입력");
		int b = input.nextInt();
		
		
		System.out.println(a + b); // 더하기 : 35
		System.out.println(a - b); // 빼기 : 5
		System.out.println(a * b); // 곱하기 : 300
		System.out.println(a / b); // 나누기 : 1
		System.out.println(a % b); // 나머지 : 5
	
		System.out.println("세번째숫자입력");
		int c = input.nextInt();
		
		System.out.println("네번째숫자입력");
		int d = input.nextInt();
				
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(str);
	
	
	}

}