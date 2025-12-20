import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        
        // **자료형을 int에서 long으로 변경하여 안전성을 극대화**
        // N*5000 = 500,000 이므로 int로 충분하지만, 혹시 모를 테스트케이스 오류를 대비
        long totalSum = 0;
        
        // N개의 숫자를 입력받아 총합 계산
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextInt()) {
                // 입력 숫자는 5,000 이하이므로 int로 받습니다.
                int number = scanner.nextInt();
                totalSum += number;
            }
        }
        
        scanner.close();
        
        // 3. 총합을 문자열로 변환 (totalSum은 long 타입이지만 String.valueOf로 변환 가능)
        String sumString = String.valueOf(totalSum);
        
        // 4. 좌측으로 한 칸 민 결과 출력 (기존의 정확한 로직)
        if (sumString.length() > 0) {
            // substring(1)을 사용하여 맨 앞의 한 글자를 제거합니다.
            String shiftedResult = sumString.substring(1);
            
            System.out.println(shiftedResult); 
        }
    }
}