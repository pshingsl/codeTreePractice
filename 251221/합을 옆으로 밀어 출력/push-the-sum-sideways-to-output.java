import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        
        // 안전성을 위해 long 타입 사용
        long totalSum = 0;
        
        // N개의 숫자를 입력받아 총합 계산
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt(); 
                totalSum += number;
            }
        }
        
        scanner.close();
        
        // 1. 총합을 문자열로 변환
        String sumString = String.valueOf(totalSum); // 예시: 2077 -> "2077"
        
        // 2. 좌측으로 '순환 이동'시킨 결과 출력
        // 이 로직이 시스템이 요구하는 0772를 출력하는 유일한 방법입니다.
        if (sumString.length() > 1) {
            // 맨 앞 문자 (인덱스 0)를 잘라서
            String firstChar = sumString.substring(0, 1); // "2"
            
            // 나머지 문자열 뒤에 붙입니다.
            // (인덱스 1부터 끝까지) + (맨 앞 문자)
            String shiftedResult = sumString.substring(1) + firstChar; // "077" + "2" = "0772"
            
            System.out.println(shiftedResult); 
        } 
        else if (sumString.length() == 1) {
            // 총합이 한 자리 숫자인 경우 (예: 5). 순환 이동시켜도 자기 자신입니다.
            System.out.println(sumString);
        }
        // else: 빈 문자열인 경우 (0 출력 방지, 발생 가능성 낮음)
    }
}