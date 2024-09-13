package b_operator;

public class Ex06_일반논리 {
	 
	public static void main(String[] args) {
		/*
		 [논리연산자](일반)
		 A스위치, B스위치       A && B(and)    A || B(or) -> &&, || 두개를 쓰면 T, F 연산자
		 F       F             F               F
		 F       T             F               T
		 T       F             F               T
		 T       T             T               T
		둘 중에 하나라도 T 이면 T인 것이 (or) 연산자
		둘 중에 하나라도 F 이면 F인 것이 (and) 연산자
		 [논리연산자](이진=bit)
		 A스위치, B스위치       A & B(and)    A | B(or)
		 0       0             0             0
		 0       1             0             1
		 1       0             0             1
		 1       1             1             1  

		*/		
		int 성적 = 75;
		char 태도 = 'A'; // char이기 때문에 문자 'A'
		//우등생 기준 
		if( 성적 >= 80 || 태도=='A') { //성적 >= 80: false or 태도 == 'A' : true (일반 논리) : true
			System.out.println("성적이 80점 이상이거나 태도가 A라면 우등생입니다");
		}
		//성적향상반
		if( 성적 >= 80 && 태도 == 'A') { //성적 >= 80: false and 태도 == 'A' : true : false
			System.out.println("성적이 80점 이상이고 태도가 A라면 성적향상반입니다");
		}
	}

}
