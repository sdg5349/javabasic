package c_control;
/*
 *  [제어문] 프로그램의 흐름 변경
 *  1. 조건문 : if/swich	
 * 	2. 반복문 :  
 *  3. 중단문 : 
 */
public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		//주민 번호로 성별 파악
				String id = "900728-1233110"; //문자열
		char sung = id.charAt(7);
		//System.out.println(sung);
		String gender = "";//gender 변수를 초기화해야함 "";

		//7번째 문자가 1이거나 3이거나 9라면 '남자' 출력, 2이거나 4이거나 0이라면 '여자' 출력
		if(sung == '1' || sung == '3' || sung == '9') {
			//System.out.println("남자");
			gender = "남자"; // 남자라고 저장하고 싶다 
			//String gender 라고 적지 않는다 String 중복
		}else if(sung == '2' || sung == '4' || sung == '0') {
			//System.out.println("여자");
			gender = "여자"; // 여자라고 저장하고 싶다
		}
		
		System.out.println("당신은 " + gender + " 입니다");
	}

}
