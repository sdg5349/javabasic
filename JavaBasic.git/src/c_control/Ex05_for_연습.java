package c_control;
import java.util.Scanner;
public class Ex05_for_연습 {

	public static void main(String[] args) {
		
//		문제 1) 1~N까지의 숫자를 다음처럼 출력하라
//				1 2 3 4 5
//				6 7 8 9 10 
//				11 12 13 14 15
//		for(int i=1; i<=15; i++) {
//			System.out.print(i + "");
//			if( i%5 ==0) { //5의 배수 별로 줄 바뀜
//				System.out.println();
//			}
//		}
//		------------------------------------------------------------
		
//		문제2)  문자열처리하기 
//      문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
//		N이 대문자이면 문자 N부터  Z까지 출력하라 
//		그 밖의 문자가 입력되면 Error 를 출력하라 
//	    
//		입력  출력
//		f       abcdef
//		X       XYZ
//		6       Error 
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("문자 하나를 입력하세요 -> ");
//		//문자형 이기 때문에 char 형으로 받아야한다
//		char ch = input.next().charAt(0);//input을 String 형으로 받는다
//		
//		//소문자 여부 판단
//		if(ch>='a' && ch<='z') {
//			//반복문 구조가 들어가야한다
//			for(char i='a';i<=ch;i++) {//char ch는 중복으로 못한다 다른 값을 잡아야함
//				System.out.print(i);
//		if(ch>='A' && ch<='Z') {
//			for(char I='X';I<='Z';I++) {//시작점의 0번째 문자를 가져오기 때문에 
//										//시작점을 X로 시작하고 출력 마지막을 Z까지로 설정
//				System.out.print(I);			
//			}
		//------------------------------------------------------------
//		문제3 ) 입력받은 문자열의 뒤집어서 출력하세요
//		 [예]  입력 -> 출력
// 		  안녕 친구  -> 구친 녕안
//		  CarpeDiem  -> meiDepraC 
//		 [힌트] 문자열의 길이 구할 때   length() 이용	
//		
//		String ch = input.nextLine();
//		int length = ch.length();
//		//System.out.println(length);
//		
//		int length = ch.length();
//		String str="";
//		
//		String I = "";
//		for(int i=length-1;i>=0 ;i--) {
//			I=I + ch.charAt(i);
//	
//		}
//		System.out.println(I);
//		
//				
//		
//		for()
//		
//		
//		for(String ch = "Z"; ch>="A"; ch--) {//for 문에서는 String 사용불가 
//											 //그렇기 때문에 문자열의 숫자를 구하고 
//											 //int 사용
//			System.out.print(ch);
//		
//		
//		
//		
//		
//	}
//
//}
		
//		
//		import java.util.Scanner;
//
//		public class Ex05_for_연습 {
//
//		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.println("문자열을 입력하세요 -> ");
		        
		        String ch = input.nextLine(); // 문자열 입력 받기
		        int length = ch.length();    // 문자열 길이 구하기
		        
		        // 문자열을 뒤집어서 출력
		        String reversed = "";
		        for (int i = length - 1; i >= 0; i--) {
		            reversed += ch.charAt(i);
		        }
		        System.out.println("뒤집힌 문자열: " + reversed);
		        
		        // 알파벳 A부터 Z까지 출력
		        for (char c = 'A'; c <= 'Z'; c++) {
		            System.out.print(c + " ");
		        }
		        System.out.println(); // 개행
		        
		        // 알파벳 Z부터 A까지 출력
		        for (char c = 'Z'; c >= 'A'; c--) {
		            System.out.print(c + " ");
		        }
		        System.out.println(); // 개행
		    }
		}
