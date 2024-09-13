package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("abc.txt");
			// 파일이 없어서 발생한 오류
			// 예외처리를 필수로 해야한다
			fis.read();// 파일을 읽는다는 표현
			
			System.out.println("파일처리");
		}catch(FileNotFoundException ex) {
			System.out.println("파일이 존재하지 않는 예외발생: " + ex.getMessage());
			// ex.printStackTrace(); // 잘못된 점이 다 나오는 것
			// 밑에 있는 catch 는 위의 catch 와 다른 점이 있을 경우에만 출력된다
			// 문제가 2개일 경우 큰 문제를 앞쪽에 작성
		}catch(Exception ex) {
			System.out.println("그 외 예외발생: " + ex.getMessage());
		}finally {
			try {
			fis.close();
			}catch(Exception ex) {}
		}
	}
}
// 예외가 발생하는 애를 catch 로 묶고 