import java.util.Scanner;

public class Main {

    /**
     * 입력 문자열에서 모든 숫자만 추출하여 정수로 변환하는 메서드 (파이썬 로직 구현)
     * @param inputString 원본 문자열
     * @return 추출된 숫자로 이루어진 정수 값
     */
    public static int extractAllDigitsAndConvert(String inputString) {
        // 추출된 숫자를 담을 StringBuilder 생성
        StringBuilder extractedDigits = new StringBuilder();
        
        // 문자열을 앞에서부터 순회하며 숫자인지 확인 (파이썬의 리스트 컴프리헨션 역할을 함)
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            
            // Character.isDigit()으로 숫자인지 확인
            if (Character.isDigit(ch)) {
                extractedDigits.append(ch);
            }
        }
        
        // 추출된 숫자가 없다면 0을 반환 (NumberFormatException 방지)
        if (extractedDigits.length() == 0) {
            return 0;
        }
        
        // 추출된 숫자 문자열을 정수(int)로 변환하여 반환
        return Integer.parseInt(extractedDigits.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 문자열 입력 (a에 해당)
        String inputA = scanner.nextLine();
        
        // 두 번째 문자열 입력 (b에 해당)
        String inputB = scanner.nextLine();
        
        // 1. 첫 번째 문자열에서 모든 숫자 추출 및 정수 변환
        int a = extractAllDigitsAndConvert(inputA);
        
        // 2. 두 번째 문자열에서 모든 숫자 추출 및 정수 변환
        int b = extractAllDigitsAndConvert(inputB);
        
        // 3. 두 정수의 합 출력
        System.out.println(a + b);
        
        scanner.close();
    }
}