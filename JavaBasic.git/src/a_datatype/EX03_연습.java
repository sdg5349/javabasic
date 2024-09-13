package a_datatype;

public class EX03_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어점수 변수 선언
		int kor; 
		// 영어점수 변수 선언
		int eng;
		// 국어점수 변수에 90점 지정
		kor = 91;
		// 영어점수 변수에 100점 지정
		eng = 100;
		// 총점 변수 선언
		int total;
		// 총점 계산하기
		total = kor + eng;
		// 총점 출력
        System.out.println("총점 : " + total);
        
        // 평균을 구해서 출력
        double average;
        average = total/2.0; 
        System.out.println("평균 : " + average); //=> 정수형 끼리 연산한 결과는 정수형이다

	}

}
