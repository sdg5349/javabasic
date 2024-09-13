package c_control;
/*
 *  분기문 switch 주의할 점
 *  1. break 문장 확인
 *  2. 문자형(char)/정수형(int/long)/문자열(String)
 * 
 */

public class Ex04_switch_주민번호 {

	public static void main(String[] args) {
		
		String id = "900728-1703110"; //태어난 년, 월, 일, 성별 지역 정보 등 가져올 수 있음
			
		char chul = id.charAt(8);
		//System.out.println(chu1);
		
		String local = "";
		switch(chul) {
		case'0' : local = "서울"; break; //case의 경우 break 잊지말 것, '0' 문자취급할 것
		case'1' : local = "인천/부산"; break; //break는 반복문을 멈추고 싶을 때 사용
		case'2' : local = "경기"; break;
		case'9' : local = "제주"; break;
		default : local = "한국"; 
		}
		System.out.println("당신은 " + local + "출신입니다");
		
	}

}
/*
 * 주민번호에서 출신지번호가 
 * 0: 서울
 * 1: 인천/부산
 * 2: 경기
 * 9: 제주
 * 나머지: 한국
 * 
 * 대략적인 구조 -> switch로 바꿔쓰기
 *  if(chul == '0'){
 *  	서울
 *  }else if(chul == '1'){
 *      인천/부산
 *  }else if(chul == '2'){
 *  	경기
 *  }else if(chul == '9'){
 *  	제주
 *  }else {
 *  	한국
 *  }
 */

