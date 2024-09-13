package b_operator;
import java.util.Scanner;// 자동 import : ctrl + shift + O
public class Ex09_복습 {

	public static void main(String[] args) {

		//scanner 사용
		Scanner input = new Scanner(System.in);
		System.out.println("문자 하나를 입력하세요 ->");
		char ch = input.next().charAt(1);//0번째 
		System.out.println("문자:" + ch);

		//사용자가 입력한 문자가 대문자인지 여부 출력

		if( ch >= 'A' && 'Z'>= ch) { // 문자가 /\'A'보다 크거나 같고, 문자가 'Z' 보다 작거나 같다면
			System.out.println("대문자");
		}else if(ch >= 'a' && 'z' >= ch) {//그렇지 않다면 문자가 'a'보다 크거나 같고 'z'보다 작거나 같다면
			System.out.println("소문자");//'소문자'라고 출력
		}else { //따로 조건이 없기 때문에 if() 작성하지 않는다
			System.out.println("기타문자");
		}//그럼에도 불구하고 그렇지 않다면 
		 //'기타문자'라고 출력 
		
		//Ascii-code
		//'A' : 65
		//'B' : 66
		//'B' > 'A'


	}

}
