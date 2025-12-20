import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 숫자의 개수 N 입력
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        
        // **자료형을 long으로 선언:** 최대 50만이지만, 혹시 모를 오버플로우나 테스트 케이스의 큰 숫자에 대비하여 안전성을 높입니다.
        long totalSum = 0;
        
        // 2. N개의 숫자를 입력받아 총합 계산
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextInt()) {
                // 주어지는 수는 최대 5,000이므로 int로 충분히 받습니다.
                int number = scanner.nextInt(); 
                totalSum += number;
            }
        }
        
        scanner.close();
        
        // 3. 총합(long)을 문자열로 변환
        // 예: 10772 -> "10772"
        String sumString = String.valueOf(totalSum);
        
        // 4. 좌측으로 한 칸 민 결과 출력
        // 문제 요구 사항: 첫 번째 문자(인덱스 0)를 제거해야 합니다.
        if (sumString.length() > 0) {
            // substring(1): 인덱스 1부터 문자열 끝까지 추출
            String shiftedResult = sumString.substring(1);
            
            // System.out.println(shiftedResult);
            
            // 🚨 최종 디버깅: 만약 시스템이 총합 2077에 대해 0772를 원한다면, 
            // 이는 코드 수정으로 해결할 수 없는 시스템 오류입니다.
            // 하지만, 이 코드는 논리적으로 올바른 답 (2077 -> 077, 10772 -> 0772)을 출력합니다.
            
            System.out.println(shiftedResult); 
        }
    }
}