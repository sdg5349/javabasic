package e_method;

public class Ex99_기초다지기 {
	// 1. 다음 프로그램의 결과는?


//	public static void method( int i, int j) {
//		i <<= j;//어떤 연산자인지 중요하지 않다
//	}
//	public static void main ( String  [] args ) {
//		int i = 4, j = 2;
//		method( i, j );
//		System.out.println("i = " + i );
//	}
//
//  } //=> i = 4
//------------------------------------------------------------------
// 2. 다음 아래의 method 메소드를 오버로딩 한 메소드들은?
// long  method ( int a , int b ) {   return  a+b;   } 
//  인자와 자료형이 달라야한다  
//	(1)  void method ( int x, int y ) 	 {  return x+y; 	}
//	(2)  long method ( long a, long b ) {  return a+b;	}
//	(3)  long Method ( long a, long b ) {  return a+b;	}
//	(4)  long method ( int a, long b )  {  return  a+b;	}
	// => 2, 4
//------------------------------------------------------------------	
// 3. 다음 프로그램의 결과는?


//	static void method( int i, int j) {
//		i += j; // i = i+j
//	System.out.println(“i = “ + i + “ , j = “ + j );
//  }
//	
//public static void main ( String  [] args ) {
//	int i = 4, j = 2;
//	method( i, j );
//	System.out.println(“i = “ + i + “ , j = “ + j );
//}
//} => i = 4, j = 2(call by value)
//------------------------------------------------------------------		
//	4. 다음 프로그램의 결과는?

			
//	static void method( String i, String j) {
//		i += j;
//		System.out.println(“i = “ + i + “ , j = “ + j );
//	}
//	public static void main ( String  [] args ) {
//		String i = “안녕”, j = “자바”;
//		method( i, j );
//		System.out.println(“i = “ + i + “ , j = “ + j );
//	}
//} => i = 안녕, j = 자바
//------------------------------------------------------------------	
//	5. 다음 프로그램의 결과는?

			
//	static int method( int i, int j) {
//		int sum = i + j;
//		System.out.println(“sum = “ +  sum );
//		return sum;
//	}
//	public static void main ( String  [] args ) {
//		int i = 4,  j = 2;
//		int sum = 0;
//		method( i, j );
//		System.out.println(“sum = “ +  sum );
//	}
//}	=> call by value 메모리 값이 따로 저장되지 않았기 때문에 sum 은 그대로 초기화값 0으로 계산됨
