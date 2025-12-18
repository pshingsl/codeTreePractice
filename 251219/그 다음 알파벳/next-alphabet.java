import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 문자 입력
        char inputChar = sc.next().charAt(0);
        
        char nextChar;
        
        // 2. 'z' 예외 처리
        if (inputChar == 'z') {
            nextChar = 'a';
        } 
        // 3. 일반적인 경우 (아스키 코드에 1을 더함)
        else {
            // (int)inputChar + 1 : 다음 문자의 아스키 코드 값
            // (char)로 다시 형 변환하여 다음 문자를 얻습니다.
            nextChar = (char)(inputChar + 1);
        }
        
        // 4. 결과 출력
        System.out.println(nextChar);
        
        sc.close();
    }
}