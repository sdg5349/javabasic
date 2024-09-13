package c_control;

public class Ex06_for중첩_알파벳 {

    public static void main(String[] args) {
        
        for(int i = 0; i < 26; i++) { // 26번 반복
            for(char ch = (char)('Z' - i); ch <= 'Z'; ch++) { // 'Z' - i 부터 'Z'까지
                System.out.print(ch); // 현재 문자 출력
            }
            System.out.println(); // 한 줄 끝나고 줄 바꿈
        }
    }
}
