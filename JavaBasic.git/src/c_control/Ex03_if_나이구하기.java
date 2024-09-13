package c_control;

import java.util.Calendar;

public class Ex03_if_나이구하기 {
	
	public static void main(String[] args)	{
		
		String id = "200101-4123456";
		String nai = id.substring(0,2); // nai = "90" 문자열 90을 추출한 것
		//int realage = (String)age; // "90" -> 90 해야하는데 String 사용이 불가
		//Casting은 기본형은 기본형 참조형은 참조형 끼리만 가능하다
		/*
		 * Wrapper class : 자료형 클래스
		 * 
		 * int    : Integer
		 * long   : Long
		 * donble : Double
		 */
		 int sunai = Integer.parseInt(nai); //"90"->90 문자열을 숫자로 형변환 
		 
		 //올해 년도 구하기
		 Calendar cal = Calendar.getInstance();//Calendar 처럼 특별한 것들은 new 생략
		 //Calendar 객체 이용하기 위해서는 Calendar.getInstance(); 이용
		 int year = cal.get(Calendar.YEAR);//빌려오는 경우 get 사용한다
		 
		 
		 int age = 0;// age 초기화한 것 
		 
		 char sung = id.charAt(7);
		 //성별 문자가 '1'이거나 '2'라면 1900을 더할 것이고
		 if(sung == '1' || sung == '2') {
			 age = year - (1900 + sunai) + 1;
		 //성별 문자가 '3'이거나 '4'라면 2000을 더할 것이다	
		 }else if(sung == '3' || sung == '4') {
			 age = year - (2000 + sunai) + 1; 
		 }
		 	 
		 
		 System.out.println("한국나이 = " + age);
				
	}
}
