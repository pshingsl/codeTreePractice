import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문자열 입력
        String str = sc.next();
        
        // 2. 제거할 문자 식별
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        
        // 3. 새로운 문자열 생성 (StringBuilder 사용 권장)
        StringBuilder result = new StringBuilder();
        
        // 4. 문자열 순회 및 문자 제거 로직
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // 현재 문자가 첫 문자 또는 마지막 문자의 값과 같으면 제거(추가 안 함)
            if (currentChar != firstChar && currentChar != lastChar) {
                result.append(currentChar);
            }
        }
        
        // 5. 결과 출력
        System.out.println(result.toString());
        
        sc.close();
    }
}