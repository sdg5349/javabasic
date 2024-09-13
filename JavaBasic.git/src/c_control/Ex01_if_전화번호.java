package c_control;

public class Ex01_if_전화번호 {

	public static void main(String[] args) {
		/*
		 * 02-222-2222
		 * 032-13-1234
		 * 051-555-9876
		 */
		String tel = "02-222-2222"; //숫자는 0부터 새는 것
		int idx = tel.indexOf('-');
		//System.out.println(idx);		
		
		String localNum = tel.substring(0, idx);
		//0번째부터 idx(2) 앞에까지의 문자열 ex)051번호라면 '-'앞까지의 번호를 가져오는 것
		//System.out.println(localNum);
		
		/*
		 * 지역번호가 02라면 "서울" 출력
		 * 그렇지 않고 지역변수가 032이라면 "인천" 출력
		 * 나머지는 "한국" 출력
		 */
		String local = ""; // local 변수를 String으로 먼저 가져와야함, local 초기화
		
	
		 if(localNum.equals("02")) {//문자열 비교는 '==' 아니고 '.equals'를 사용할 것
			 local = "서울";
		 }else if(localNum.equals("032")) {
			 local = "인천";
		 }else {
			 local = "한국";
		 }
		 System.out.println(local + "입니다");
		 
	}
}
