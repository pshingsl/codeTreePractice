import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // N 입력 (예: 5)

        // 1. 바깥쪽 for문: 행 제어 (i는 구구단의 앞 숫자)
        for (int i = 1; i <= n; i++) { 
            
            // 2. 안쪽 for문: 열 제어 (j는 구구단의 뒷 숫자)
            // 역직각삼각형 패턴 구현: j는 1부터 (N - i + 1)까지만 반복!
            // 예: i=1일 때 j<=5, i=5일 때 j<=1
            int limit = n - i + 1; // j가 반복해야 할 횟수 (또는 최종 숫자)
            
            for (int j = 1; j <= limit; j++) {
                
                // 3. 구구단 출력
                System.out.print(i + " * " + j + " = " + (i * j));
                
                // 4. 구분자 출력: 현재 요소(j)가 이 행의 마지막 요소(limit)가 아닐 때만 " / " 출력
                if (j < limit) {
                    System.out.print(" / ");
                }
            }
            
            // 한 행의 출력이 끝나면 줄바꿈
            System.out.println();
        }
        sc.close();
    }
}