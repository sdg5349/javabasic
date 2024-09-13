package f_exception;
/*
 *  오류 - 에러, 예외
 *  1. 에러 : 심각한 오류 
 *  2. 예외 : 심각하지 않은 오류
 *  
 *  에러는 건드릴 수 없지만 예외 처리는 가능하다
 *  예외처리 : 최종적인 목적은 프로그램이 정상적으로 종료
 *  예외처리 방법 : try~catch, 함수 뒤에 throws
 *  1. try~catch 
 *  	
 *  	try {
 *   			예외가 발생할 여지가 있는 구문
 *   		}catch(Exception ex){
 *   			예외가 발생한 후에 구문
 *   		}finally{
 *   			예외 관련 없이 무조건 실행구문
 *   		}
 *   
 *   2. 함수 뒤에 throws
 *   
 * 
 */
public class Ex01_TryCatch {

	public static void main(String[] args) {
		
//		//String [] str = new String[] {};// 배열이기 때문에 new 사용
//		// 위에가 정석적 표현 근데 보통 아래 표현으로 사용
//		String [] str = {"안녕하세요", "올라", "하이"};
//		
//		for(int i=0; i<=str.length; i++) { // i<str -> i<=str 로 변경해서 결과도출 불가
//			System.out.println(str[i]);    // 정상적이지 않은 주소를 포함하게 되었기 때문
//		}
//		
//		System.out.println("프로그램 종료");
//-----------------------------------------------------------------------------
		//정상 코딩에서 try~catch 예외처리 방법 사용한 예시
		
		String [] str = {"안녕하세요", "올라", "하이"};

		try{
			for(int i=0; i<=str.length; i++) { // i<str -> i<=str 로 변경해서 결과도출 불가
				System.out.println(str[i]);    // 정상적이지 않은 주소를 포함하게 되었기 때문
			}
			//return; // 구문을 정상적으로 고치고 return 을 넣으면 return 부분에서 제어권 반환하고
					// 아래 코딩이 수행되지 않는다 하지만 finally 경우 무조건 수행
					// 만약에 return 앞의 코딩이 정상이 아니라면 return 은 작동하지 않는다
		}catch(Exception ex) {
			System.out.println("예외발생:" + ex.getMessage());
		}finally {
		System.out.println("무조건 실행 구문");
		}

		System.out.println("프로그램 종료");
	}
}
