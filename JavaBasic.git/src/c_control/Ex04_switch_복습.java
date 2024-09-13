package c_control;

public class Ex04_switch_복습 {

	public static void main(String[] args) {
		
		int kor=90, eng=80, math=70;
		int total = kor + eng + math;
		int avg = total/3;
		System.out.println("평균" + avg);
		
		char score = '\u0000';//유니코드 0 초기화 시킬 때(오리지날 자바에서 사용) = 0;		
		switch(avg/10) { //case 는 독립적인 문자를 사용 문장을 사용할 수 없다
					 	 //case 값을 간략하게 하기 위해서 avg / 10을 사용
						 //단, 평균이 100점이라면 avg/10 = 10이기 때문에 F학점 결과 도출
		case 10: //break 가 없기 때문에 case 10 이 case 9의 조건을 사용하게 된다
		case 9: score = 'A'; break;
		case 8: score = 'B'; break;
		case 7: score = 'C'; break;
		default : score = 'F';
		}
		
		System.out.println("당신의 학점은 " + score);
		
		
	}
}
/*
 * 평균 90이상이면 A학점
 * 90미만 80이상이면 B학점
 * 80미만 70이상이면 C학점
 * 그외는 F
 * (switch 문 이용)
 * 
 */

