import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 1. 사용자로부터 문자열 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String inputString = scanner.nextLine();
        scanner.close();

        // 2. 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();

        // 3. 문자열 순회하며 대소문자 반전
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            // 파이썬 로직: if c.upper() == c: (현재 문자가 대문자인 경우)
            if (Character.isUpperCase(c)) {
                // 대문자를 소문자로 변환
                result.append(Character.toLowerCase(c));
            } 
            // 파이썬 로직: elif c.lower() == c: (현재 문자가 소문자인 경우)
            else if (Character.isLowerCase(c)) {
                // 소문자를 대문자로 변환
                result.append(Character.toUpperCase(c));
            } 
            // 대문자도 소문자도 아닌 경우 (숫자, 기호, 공백 등)
            else {
                // 문자를 그대로 유지
                result.append(c);
            }
        }

        // 4. 결과 출력
        System.out.println("변환된 문자열: " + result.toString());
    }
}