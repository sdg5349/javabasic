package e_method;
/*
 * overloading : method(함수)명이 동일한 함수들		
 *  ex) int a; double a; 동일한 이름
 *  	void test() void test(int a) : 동일한 이름이라도 인자가 다르면 가능 -> overloading
 */
public class Ex08_overloading {
	
	public static void main(String[] args) {
/*
 *  overloading 이 없다면
 * 		void drawRect(int w, int h){
 * 		// 폭과 높이로 사각형 그리기
 * 		}
 *		
 *		void drawRect2(Point p1, Point p2, Point p3, Point p4){
 *		// 점 4개 정보로 로 사각형 그리기 
 * 		}
 *  ----------------------------------------------------------------
 *  overloading 이 적용된다면
 *  	void drawRect(int w, int h){
 * 		// 폭과 높이로 사각형 그리기
 * 		}
 *		
 *		void drawRect(Point p1, Point p2, Point p3, Point p4){
 *		// 점 4개 정보로 로 사각형 그리기 
 * 		}
 * 
 * 
 */
		String str = new String("홍길순");
		StringBuffer sb = new StringBuffer("홍길자");
		char [] ch = new char [] {'홍','길','동'};
		
		System.out.println(str);
		System.out.println(sb);
		System.out.println(ch);
		
	}
}
