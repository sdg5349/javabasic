package b_operator;

public class Ex13_복습 {

	public static void main(String[] args) {
		
		int kor = 45, eng= 67, math = 77;
		int total = kor + eng + math;
		if(total > 150 && total < 250) { // 150<total<250 컴퓨터는 읽지 못함
			System.out.println("보통반입니다");
		}else {
			System.out.println("보통반 아닙니다");
		}

	}

}
