package b_operator;

/*
 *  비교연산자 
 *  > >= < <= == !=
 * 
 */
public class Ex05_비교연산자 {
	
	public static void main(String[] args) {
		
		//복습
		int kor = 89, eng = 87, math = 77;
		// 총점, 평균을 구해서 변수에 저장하고 출력
		int total = kor + eng + math;
		double average = (double)total/3;
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ average);
		
		/*
		 * [학점구하기]
		 * 평균이 90점 이상이면 A학점
		 * 평균이 80이상 90미만이면 B학점
		 * 평균이 70이상 80미만이면 C학점
		 */
		
		 if(average >= 90) { //만약에 평균값이 90이상이라면 
			 System.out.println("A학점"); //그렇다면 A학점을 출력
		 }else if(average >= 80) { //그렇지 않다면 + 만약에 평균값이 80이상이라면
			 System.out.println("B학점"); //그렇다면 B학점을 출력
		 }else if(average >= 70) { //그렇지 않다면 + 만약에 평균값이 70이상이라면
			 System.out.println("C학점"); //그렇다면 C학점을 출력
		 } //만약에 반대의 개념으로 70~ 작은 값부터 쓰게 된다면 70학점에 처음 포합되게 된다
		   //그렇기 때문에 이런 경우 가장 높은 점수부터 작성해야한다
		 
	}

}
