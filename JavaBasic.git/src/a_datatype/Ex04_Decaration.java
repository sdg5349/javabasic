package a_datatype;

public class Ex04_Decaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int kor; //숫자를 저장하는 변수 kor을 선언 -> 변수선언
		kor = 30; //선언한 변수에 30을 대입 -> 값대입
		
		int eng = 30; //초기화 = 변수선언 + 값대입 
		*/
		
		int kor = 30, eng = 50;
		System.out.println("국어 : " + kor + " , 영어 : " + eng);
		System.out.printf("국어 : %d , 영어 : %d\n\n\n", kor, eng);
		//f 사용할때? 실수를 사용할 때 f, 정수를 사용할 때 d
		//System.out.println(); or \n 띄어쓰기로 사용
		/*
		 * 만약에 국어점수와 영어점수가 동일하니
		 * 그렇다면 "두 점수가 동일"이라고 출력
		 * 그렇지 않다면 "두 점수는 다름"이라고 출력 -> else
		 */
		if(kor == eng) { // 국어점수와 영어점수가 같니?
			System.out.println("두 점수가 동일");
		}else {
			System.out.println("두 점수가 다름");
		}
				
		int temp = kor;//이 때는 임시 변수 하나를 만들어놔야함
		kor = eng;//두 점수 맞바꾸기 -> 두 변수의 값을 바꾸기
		eng = kor;//kor = 30, eng = 50 이렇게 되어야하는데 이미 kor = 50이 된 상태
		eng = temp;		
		//[바꾼 후] kor = 50, eng = 30
		
	

	}

}
