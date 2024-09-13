package alone_practice;

import java.util.Scanner;

public class method_240909 {

    private static char[][] alpha; // 배열을 저장할 클래스 변수

    public static void main(String[] args) {
        input();  // 사용자 입력 받기
        output(); // 배열 출력
    }
    
    /*
     * 문자 배열에 저장된 문자들을 화면에 출력한다.
     */
    static void output() {
        if (alpha != null) { // 배열이 null이 아닐 때만 출력
            for (int i = 0; i < alpha.length; i++) {
                for (int j = 0; j < alpha[i].length; j++) {
                    System.out.print(alpha[i][j] + " "); // 배열의 요소를 출력
                }
                System.out.println(); // 줄 바꿈
            }
        } else {
            System.out.println("배열이 초기화되지 않았습니다.");
        }
    }

    /*
     * 두 정수와 알파벳 문자 하나를 입력받는다
     * [예] 3 4 F
     */
    static void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("정수1");
        int num1 = input.nextInt();
        System.out.println("정수2");
        int num2 = input.nextInt();
        System.out.println("알파벳");
        char startChar = input.next().charAt(0); // 문자 입력받기
        
        makeSquare(num1, num2, startChar); // 배열을 생성하고 초기화
    }
    
    // 입력받은 첫 번째 정수만큼의 행과 두 번째 정수만큼의 열을 가진 문자 배열을 생성
    // 입력받은 문자를 시작으로 저장한다.
    static void makeSquare(int num1, int num2, char startChar) {
        alpha = new char[num1][num2]; // num1 행, num2 열의 2차원 배열 생성
        
        char currentChar = startChar; // 시작 문자를 설정

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                alpha[i][j] = currentChar; // 배열에 문자 저장
                currentChar++; // 문자 증가
                // 문자 범위를 넘으면 'A'로 돌아가도록 할 수 있습니다. 
                if (currentChar > 'Z') {
                    currentChar = 'A';
                }
            }
        }
    }
}
