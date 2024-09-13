package d_array;

public class Ex00_배열문법 {

	public static void main(String[] args) {
		
		// 배열변수 선언
//		int [] kor = null; // int가 여러개 들어가는 배열변수 선언
//		                   // 참조형의 초기화는 null; 사용
//						   // 변수 만들고 -> 변수 명을 지정 -> 초기화시킨 상태
//		// 배열객체 생성
//		kor = new int[3]; // 참조형 new 사용
//		// 값지정
//		kor[0] = 100;
//		kor[1] = 200;
//		kor[2] = 300;
		
//		//int [] kor = null; + kor = new int[3];
//		int [] kor = new int[3]; // 짧을 경우 이렇게도 표현이 가능하다
//		
//		// 값지정
//		kor[0] = 100;
//		kor[1] = 200;
//		kor[2] = 300;
		
		//초기화 
		// 배열변서 선언 + 객체 생성 + 값지정
		//int [] kor = new int [] { 100, 200, 300}; // 정석적인 표현
		int [] kor = {100, 200, 300}; // 더욱 짧게 쓴다면 이렇게도 가능
									  // 이것만으로도 정수형 3개가 들어간다를 인식한다
		
		// 총점 구하기
		int total = 0; // 토탈 변수 초기화
		for(int i=0 ;i<kor.length;i++ )	{ // 숫자가 많아 질 수 있기 때문에 총 갯수를 kor.length 사용
								  // 길이는 0부터 시작하지 않기 때문에 =< 사용하지 않는다 무조건 <
			total += kor[i];
		}
		System.out.println("총점 : " + total);
		
	}

}
