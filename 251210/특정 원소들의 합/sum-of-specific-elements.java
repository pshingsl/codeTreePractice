import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N은 배열의 크기. 예시에서는 4x4
        final int N = 4; 
        int[][] arr = new int[N][N];
        int sum = 0;

        // 1. 배열에 값 입력 받기 (4x4 = 16개의 값 입력)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // 2. 2중 반복문을 사용하여 규칙에 맞는 요소들의 합 계산
        // 바깥 루프: 행 인덱스 i (0부터 N-1까지)
        for (int i = 0; i < N; i++) { 
            
            // 안쪽 루프: 열 인덱스 j. 
            // i번째 행에서는 0부터 i+1개 (j < i + 2) 까지만 반복
            // (i=0일 때 j<2, i=1일 때 j<3, i=2일 때 j<4, i=3일 때 j<5)
            // *주의: 이 문제는 실제 문제 조건에 따라 j < N 일 수도 있습니다. 
            //         여기서는 주어진 예시의 선택된 셀의 개수(2, 2, 3, 4)를 기준으로 합니다.
            int limit_j = i + 2;
            if (limit_j > N) {
                limit_j = N; // 배열 범위를 벗어나지 않도록 최대 N으로 제한
            }
            
            for (int j = 0; j < limit_j; j++) { 
                sum += arr[i][j];
            }
        }
        
        // 3. 결과 출력
        System.out.println(sum);
    }
}