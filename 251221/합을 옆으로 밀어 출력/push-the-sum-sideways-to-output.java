import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        
        // **totalSum을 long 타입으로 선언**하여 혹시 모를 오버플로우에 대비합니다.
        long totalSum = 0;
        
        // N개의 숫자를 입력받아 총합 계산
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                totalSum += number;
            }
        }
        
        scanner.close();
        
        // 1. 총합(long)을 문자열로 변환 (Integer.toString과 동일한 기능을 하는 String.valueOf 사용)
        // Integer.toString()은 int 타입만 받지만, String.valueOf()는 long 타입도 처리합니다.
        String sumString = String.valueOf(totalSum);
        
        // 2. 좌측으로 한 칸 민 결과 출력 (맨 앞 글자 제거)
        if (sumString.length() > 0) {
            // substring(1): 인덱스 1부터 문자열 끝까지 추출 (맨 앞 인덱스 0 제거)
            String shiftedResult = sumString.substring(1);
            
            // 결과 출력 (0이 있어도 생략하지 않고 모두 출력)
            // 예: 2077 -> 077
            // 예: 10772 -> 0772
            System.out.println(shiftedResult); 
        }
    }
}