package b_operator;

public class Ex08_ShortCircuitLogic {
	
	public static void main(String[] args) {
		
		int a = 3;
		//if(조건) 조건이 true면 실행 false면 실행하지 않을 것이다
		if(a>3 & ++a>3) { // if(false && true) = false
			System.out.println("조건만족");
		}
		
		System.out.println("A = " + a);
		//다른 ide를 이렇게 돌린다면 4가 나오지만 java는 3이나온다 
		//&&때문 왜냐하면 if(false && true) = false 
		
		int b = 3;
		//if(조건) 조건이 true면 실행 false면 실행하지 않을 것이다
		if(b>3 & ++b>3) { // 이진논리 & 하나짜리로 만든다면
			System.out.println("조건만족2");
		}
		
		System.out.println("B = " + b);
		//java 또한 4가 나온다
		//------------------------------------------------
	    int c = 3;
	    if(c>1 | ++ c>3) { //or연산자는 둘 중 하나만 true 라도 결과가 true
	    	System.out.println("조건만족3"); //true이므로 조건만족 3이라는 결과와 C값 3이 정확하게 도출된다
	    }
	    System.out.println("C = " + c);
	   
		
	}

}
