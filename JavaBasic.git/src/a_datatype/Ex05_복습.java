package a_datatype;

public class Ex05_복습 {
	
	public static void main(String[] args) { //main은 시작점
		
		
		int temp = 35;//나이를 저장한 변수를 선언하고 본인의 나이를 대입한 후 출력
		double temp1 = 178.8;//본인의 키를 소수점 포함한 데이타로 저장하고 출력
		System.out.println("키는 " + temp1 + "입니다.");
		//char name = '신동권';//이름 저장할 변수를 선언하고 이름을 대입 후 출력
		//char는 단 하나의 값만 가능 고로 신/동/권 다 따로 변수지정해야함
		char name  = '신';//문자 취급으로 '' , 문장만 ""
		char name2 = '동';
		char name3 = '권';
		
		//******************************
		//문자 : char
		//문자열 : String (참조형 - 클래스)
		String irum = "신동권"; // string 첫글자 대문자로 작성해야함
		System.out.println("이름은 " + irum + "입니다.");

		
		
	
	}

}
