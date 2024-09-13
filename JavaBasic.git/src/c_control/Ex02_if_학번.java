package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {

/*
 * 우리대학의 학번은 총 10자리로 되어 있습니다.
맨 앞의 4자리는 입학년도이고 다섯번째 문자는 단과대 번호입니다.
     1 : 공대
     2 : 사회대
그 뒤의 2자리는 각 학과번호입니다.
  공과대학인 경우는
     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
     22 : 자바학과         33 : 서버학과
사회대학인 경우는
 11 : 사회학과         12 : 경영학과          13 : 경제학과
 ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
 ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
 ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다
 * 
 */
		String id = "2017111001"; // String으로 잡으면 "", char으로 잡으면 ''
		
		//입학연도 구하기
		String year = id.substring(0,4);//0번째 부터 4번째 앞까지 가져오기
		
		//단과대 가져오기
		char uni = id.charAt(4); // 문자형이기 때문에 char
		String college = "";
		String department = "";
		String major = id.substring(5,7);//major 변수를 if 블록 외부에서 선언
		if(uni == '1') {
			college = "공대";
		
	        //대학교 아래에서 학과 구하기
		    
		    if(department.equals("11")) { // major 변수가 문자 열이므로 == 아닌 .equals 사용
			major
			= "컴퓨터학과";
	        }else if(department.equals("12")) {
	    	major = "소프트웨어학과";
	        }else if(department.equals("13")) {
	    	major = "모바일학과";
	        }
		
		}else if(uni == '2') {
			college = "사회대";
						if(department.equals("22")) {
				major = "사회학과";
		    }else if(department.equals("33")) {
		    	major = "경영학과";
		    }
		
		
		
		}
		//결과 출력
		String result = id + "는 " + year +  " 년도에 입학한 " + college + major + " 학생입니다";
		System.out.println(result);
	
	}
}
