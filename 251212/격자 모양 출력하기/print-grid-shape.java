import java.util.Scanner;

public class ArrayInitializer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. N과 M 입력 받기
        // N: 배열의 크기 (N x N)
        // M: 좌표 쌍의 개수
        // 예: 3 2 (N=3, M=2)
        try {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            // 2. N x N 크기의 2차원 배열 선언 및 초기화 (0으로 자동 초기화됨)
            // 배열 인덱스는 0부터 시작: arr[n][n]
            int[][] arr = new int[n][n];

            // 3. M개의 좌표 쌍을 입력받아 배열에 값 채우기
            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt(); // 행 값 (1-base)
                int b = scanner.nextInt(); // 열 값 (1-base)

                // 배열에 'a * b' 값을 저장합니다.
                // 배열 인덱스는 0부터 시작하므로, a-1, b-1 위치에 저장합니다.
                // a * b 부분이 수정된 핵심 로직입니다.
                arr[a - 1][b - 1] = a * b; // ✅ 올바른 값: 행 값 * 열 값
            }

            // 4. 배열 내용 출력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // arr[i][j]를 출력합니다. (여기서 i와 j는 0-base 인덱스)
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(); // 한 행이 끝나면 줄바꿈
            }

        } catch (Exception e) {
            System.out.println("입력 형식이 잘못되었습니다.");
        } finally {
            scanner.close();
        }
    }
}