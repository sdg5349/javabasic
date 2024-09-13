package a_datatype;

/*
 * 자바에서 콘솔 입력받는 방법
 * 
 *     - java.util.Scanner -> jana, util 폴더 안에 Scanner라는 class
 *     - 정수형 입력시 : nextInt()
 *     - 실수형 입력시 : nextDouble()
 *     - 문자열 입력시 : next() / nextLine() ***[숙제] 차이점 무엇인가?
 *     = 개행문자를 무시하냐 안하냐의 차이
 *     
 *     
 */

import java.util.Scanner; //Scanner 를 쓰려면 import 사용해야한다.String 사용시에는 import 사용 안함
//[참고] 자주 사용하는 기본적인 클래스는 java.lang 패키지
//import java.lang.*; *는 전부다 라는 의미


public class Ex08_Scanner {
	
	public static void main(String[] args) {
		
		int kor, eng, math;
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어입력->");
		kor = input.nextInt();
		
		System.out.println("국어 : " + kor);
		
		// 영어점수 입력받기, 수학점수 입력받기 , 출력
		
	    System.out.println("영어입력->");
	    eng = input.nextInt();
	    System.out.println("영어 : " + eng);
	    
	    
	    System.out.println("수학입력->");
	    math = input.nextInt();
	    System.out.println("수학 : " + math);
	    
	    //총점구해서 출력
	    //평균구해서 출력
	    
	    int total;
	    total = kor + eng + math;
	    System.out.println("총점 : " + total);
	    
	    int average;
	    average = total/3;
	    System.out.println("평균 : " + average);
	    		
	   
		
	}

}
