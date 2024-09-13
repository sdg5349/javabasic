package d_array;

import java.nio.file.spi.FileSystemProvider;
import java.util.*; //배열에서는 필수

public class Ex01_요일 {

	public static void main(String[] args) {
		
		// Calendar cal = new Calendar(); 이런식은 오류가난다
		Calendar cal = Calendar.getInstance();
		// Calendar cal = Calendar.getInstance();를 사용하여 현재 날짜와 시간을 얻는다
		System.out.println("현재 날짜 확인");
		System.out.print( cal.get(Calendar.YEAR) + "년 " );
		System.out.print( cal.get(Calendar.MONTH)+1 +"월 "); 
		// 동양식 서양식 계산법이 다르기 때문에 0 = 1월 따라서 month + 1 이 필요하다
		System.out.println( cal.get(Calendar.DATE) +"일 ");
		
		System.out.println("현재 시간 확인");
		System.out.print( cal.get(Calendar.HOUR) + "시 " );
		System.out.print( cal.get(Calendar.MINUTE) + "분 " );
		System.out.print( cal.get(Calendar.SECOND) + "초 " );
		
		String [] yoil = {"일","월","화","수","목","금","토"};//일요일부터 시작 일요일 = 1
		System.out.println("현재 요일");
		//sunday : 1,....., friday : 6 따라서 요일 -1 을 해야지 한국식으로 가능하다
		System.out.println( yoil[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일 " );// 요일이 숫자로 표현된다
		//요일 다른 표현
		int yoilnum = cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(yoil[yoilnum] + "요일");
	}
}
