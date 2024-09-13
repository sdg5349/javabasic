package f_exception;

public class Ex04_Throw {

	public static void main(String[] args) {
		try {
			readMessage();
		}catch(Exception ex) {
			System.out.println("실패: " + ex.getMessage());
		}
		System.out.println("프로그램 종료");
		// static void readMessage() 함수가 비정상이기 때문에 프로그램 종료가 선언 X
		// 정상일 경우에만 선언 가능하다
	}
	static void readMessage() throws Exception{
		String [] str = {"안녕하세요", "올라", "하이"};
		try {
			for(int i=0; i<=str.length; i++) { 
				System.out.println(str[i]); 
			}
		}catch(Exception ex) {
			throw new MyException();
			
		}
				
	}
}
