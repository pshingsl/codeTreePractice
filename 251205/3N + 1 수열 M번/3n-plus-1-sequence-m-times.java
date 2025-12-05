import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 첫 번째 입력 M (테스트 케이스의 개수)을 읽습니다.
        int M = sc.nextInt();
        
        // 2. M개의 테스트 케이스만큼 반복하는 외부 반복문
        for (int i = 0; i < M; i++) {
            // 3. M번 반복하면서 각 줄의 N 값을 읽습니다.
            // long 타입을 사용하여 N의 값이 커지는 경우를 대비할 수 있지만,
            // 문제의 제약 조건(N <= 100)을 고려하면 int로 충분합니다.
            int N = sc.nextInt();
            
            // 4. 반복 횟수를 저장할 변수 count를 0으로 초기화합니다.
            int count = 0;
            
            // 5. N이 1이 될 때까지 반복하는 내부 반복문 (핵심 로직)
            // N이 1이면 (이미 종료 조건에 도달) 0번 반복이므로,
            // N이 1이 아닐 때만 반복합니다.
            if (N != 1) {
                // N이 1이 될 때까지
                while (N != 1) {
                    // 짝수인 경우
                    if (N % 2 == 0) {
                        N = N / 2;
                    } 
                    // 홀수인 경우
                    else {
                        N = 3 * N + 1;
                    }
                    
                    // 단계를 거쳤으므로 횟수를 1 증가시킵니다.
                    count++;
                }
            } 
            // N이 처음부터 1인 경우 (입력 예제 2의 첫 번째 케이스)
            else {
                count = 0;
            }
            
            // 6. 계산된 반복 횟수(count)를 출력합니다.
            System.out.println(count);
        }
        
        sc.close(); // Scanner 사용을 마쳤으므로 닫아줍니다.
    }
}