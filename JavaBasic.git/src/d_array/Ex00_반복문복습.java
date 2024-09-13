package d_array;

public class Ex00_반복문복습 {

	public static void main(String[] args) {
		
		// import 하기 귀찮아서 lang 안에 있는 Math 를 쓸거다?
		// Math 안에 있는 random 사용
		// double temp = Math.random()*10; // random 값은 0.0<= random() <= 1.0
		// int temp = (int)(Math.random()*10);// 0~9까지의 랜덤수
		
// for문
		for(int i=0; i<6 ; i++) {
			int temp = (int)(Math.random()*45)+1;// 1~45까지의 랜덤수
			System.out.print(temp + "/");
		}
		// 랜덤으로 6개의 수가 나온다 하지만 임의의 수가 6개 나오는 것으로 중복되는 수가 나올 수 있다	
		System.out.println();

// while문 변경
		int j=0;
		while(j<6) {
				int temp = (int)(Math.random()*45)+1;// 1~45까지의 랜덤수
				j++;
				System.out.print(temp + "/");
		}
		System.out.println();
		
// do~while문 변경
		int k=0;
		do{
			int temp = (int)(Math.random()*45)+1;// 1~45까지의 랜덤수
			k++;
			System.out.print(temp + "/");
		} while(k<6);
		System.out.println();
				
	}

}
	
