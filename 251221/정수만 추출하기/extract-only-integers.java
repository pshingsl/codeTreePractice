import java.util.Scanner;

public class Main { // 클래스명을 Main으로 변경

    /**
     * 문자열의 맨 앞에서부터 시작하는 정수 부분을 추출하여 int로 반환합니다.
     * @param s 추출할 문자열
     * @return 추출된 정수 값 (숫자가 없는 경우 0 반환)
     */
    public static int extractInteger(String s) {
        // 추출된 숫자를 임시로 담을 StringBuilder
        StringBuilder extracted = new StringBuilder();
        
        // 문자열을 앞에서부터 한 글자씩 순회
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // 기본 문법: Character.isDigit(ch)를 사용하여 숫자인지 확인
            if (Character.isDigit(ch)) {
                // 숫자이면 extracted에 추가
                extracted.append(ch);
            } else {
                // 숫자가 아닌 문자를 만나는 순간 반복을 즉시 멈춥니다.
                break; 
            }
        }
        
        // 추출된 문자열이 존재하면 정수로 변환하여 반환
        if (extracted.length() > 0) {
            return Integer.parseInt(extracted.toString());
        } else {
            // 추출된 숫자가 없는 경우 (문제 조건상 최소 1개는 보장됨)
            return 0; 
        }
    }

    public static void main(String[] args) {
        // Scanner를 사용하여 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        // 한 줄 전체를 입력받은 후, 공백을 기준으로 분리합니다.
        // 예: "12.52 87%23" -> parts 배열: ["12.52", "87%23"]
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        
        // 입력 문자열이 두 개인지 확인
        if (parts.length != 2) {
            System.out.println("입력 형식이 올바르지 않습니다. (두 개의 문자열 필요)");
            scanner.close();
            return;
        }

        // 1. 첫 번째 문자열에서 정수 추출
        int num1 = extractInteger(parts[0]);
        
        // 2. 두 번째 문자열에서 정수 추출
        int num2 = extractInteger(parts[1]);
        
        // 3. 두 정수의 합 계산 및 출력
        int sum = num1 + num2;
        
        // 결과 출력 (예: 12 + 87 = 99)
        System.out.println(sum);
        
        scanner.close();
    }
}