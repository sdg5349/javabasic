package b_operator;

public class Ex09_삼항 {
	
	public static void main(String[] args) {
		//점수가 80점보다 크면 '합격'이라고 저장을 하고 아니면 '불합격'이라고 저장
		int score = 79;
		String result; //문자처리 위해서 int 말고 String
		if(score > 80) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println("당신은 " + result);
		
		String result2 = (score > 80) ? "합격":"불합격" ; //조건 ? true결과 : false결과 
		                                                //항이 3개라 삼항연산자
		System.out.println("당신은 " + result2);
		
		//다른 방식으로 결과 도출한 것
		int score2 = 81;
		//String result; //문자처리 위해서 int 말고 String
		if(score2 > 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
	    }
		
	}
}
