import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 사용자 입력을 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 1. 숫자의 개수 N 입력
        // N의 범위는 1 <= N <= 100
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        
        // 총합을 저장할 변수. 주어지는 수의 최대값은 5,000이고 N의 최대값은 100이므로,
        // 총합의 최대값은 5000 * 100 = 500,000 입니다. 따라서 int 타입으로 충분합니다.
        int totalSum = 0;
        
        // 2. N개의 숫자를 입력받아 총합 계산
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                totalSum += number;
            }
        }
        
        // Scanner 닫기
        scanner.close();
        
        // 3. 총합을 문자열로 변환
        String sumString = String.valueOf(totalSum);
        
        // 4. 좌측으로 한 칸 민 결과 출력
        // 좌측으로 한 칸 민다는 것은 첫 번째 문자(인덱스 0)를 제거하는 것입니다.
        
        // 문자열의 길이가 1 이상인 경우에만 substring을 수행합니다.
        // 예를 들어 총합이 12345면, sumString.length()는 5
        if (sumString.length() > 0) {
            // substring(1)은 인덱스 1부터 문자열의 끝까지를 추출합니다.
            // (예: "12345" -> "2345")
            // (예: "9" -> "" (빈 문자열))
            String shiftedResult = sumString.substring(1);
            
            // 문제 조건: 출력 결과가 0으로 시작하더라도 0을 생략하지 않아야 하지만, 
            // 현재 로직은 이미 문자열 상태에서 처리되므로 0이 생략될 일이 없습니다.
            // (예: 총합이 1020이면 "020"이 출력됨)
            
            // 만약 총합이 9이고 좌측으로 밀어 빈 문자열이 되었다면, 빈 문자열이 출력됩니다.
            // 이는 문제의 요구 사항을 따르는 것으로 간주합니다.
            
            System.out.println(shiftedResult);
        } else {
            // 이 경우는 발생하기 어렵지만, 총합이 음수일 경우 '-'가 첫 글자일 수 있습니다.
            // 하지만 주어지는 수가 10 이상이므로 총합은 항상 양수입니다.
        }
    }
}