package c_control;

public class Ex06_for_중첩 {

    public static void main(String[] args) {
        
        // 1. 5x5 별 패턴
        System.out.println("5x5 별 패턴:");
        for (int j = 0; j < 5; j++) { // 5 줄
            for (int i = 0; i < 5; i++) { // 5칸
                System.out.print("*"); // 별 출력
            }   
            System.out.println(); // 줄 바꿈
        }

        System.out.println(); // 빈 줄

        // 2. 왼쪽 정렬된 삼각형 별 패턴
        System.out.println("왼쪽 정렬된 삼각형 별 패턴:");
        for (int j = 0; j < 5; j++) { // 5 줄
            for (int i = 0; i < (j + 1); i++) { // (j + 1)칸
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄 바꿈
        }
    }

// 결과가 역순으로 나오게 하라
				for(int j=0; j<5; j++) { //5줄
					
					for(int i = 0 ;i<j ;i++ ) { //공백 출력
						System.out.print(" ");
					}
						for(int i=0 ; i<5-j ; i++) { // 5칸
					System.out.print("*");
				}
				System.out.println();
//			}	
//		----------------------------------------------------------		
	}//end of main
//}//end of class
// 		----------------------------------------------------------
	
				
