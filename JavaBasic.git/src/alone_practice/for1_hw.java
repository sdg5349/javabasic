package alone_practice;

//import java.util.Scanner;

public class for1_hw {

	public static void main(String[] args) {
//[숫자사각형 문제 1]		
//		Scanner input = new Scanner(System.in); 
//		System.out.println("숫자 2개 입력");
//		
//		int row = input.nextInt();
//		int col = input.nextInt();
//		int su = 1;
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(su + " ");
//			su++;
//			}
//			System.out.println();
//		}----------------------------------------------------
//[숫자사각형 문제 2]	
//		Scanner input = new Scanner(System.in); 
//		System.out.println("숫자 입력");
//		
//		int n = input.nextInt();//정사각형 한 변의 길이 n
//		int su = 1;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(su + " ");
//				su++;
//			}
//			System.out.println();
//		}
//[숫자사각형 문제 3]		
//		Scanner input = new Scanner(System.in); 
//		System.out.println("숫자 2개 입력");
//		
//		int n = input.nextInt();//한 변의 길이 n
//		int m = input.nextInt();//다른 한변 m
//		int su = 1;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(su + " ");
//				su++;
//			}
//			System.out.println();
//		}
//[알파벳 문제1]		
//		for(int i=0;i<26;i++) {
//			//반복하는 변수 i 설정; 26번 반복; 반복 될수록 숫자많아짐
//			for(char ch = 'A';ch<='A'+i;ch++) {
//				System.out.print(ch);
//				}
//			System.out.println();
//			}
//[알파벳 문제2]
//		for(int i=0;i<26;i++) {
//			for(char ch='A';ch<='Z'-i;ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//[알파벳 문제3]
		for(int i=0;i<26;i++) {
			for(char ch='Z';ch>='Z'-i;ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
//  [알파벳 문제4]	
//		for(int i=0;i<26;i++) {
//			for(char ch=(char)('A'+i);ch<='Z';ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		
	}

}
