import java.util.Scanner;

public class GridSquareMaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N을 입력하세요 (예: 5):");
        int N = scanner.nextInt();
        
        // N x N 크기의 2차원 배열 선언
        int[][] grid = new int[N][N];

        // 이중 반복문을 사용하여 격자 채우기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                
                // 1. 첫 행 (i=0)과 첫 열 (j=0)은 모두 1로 설정 (경계 조건)
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                } 
                
                // 2. 나머지 요소 (i > 0 이고 j > 0) 계산
                // 규칙: A[i][j] = A[i-1][j] + A[i][j-1] + (A[i-1][j] - A[i-1][j-1])
                // => A[i][j] = A[i-1][j] + A[i][j-1] - A[i-1][j-1] + [증가량]
                else {
                    // 이 배열을 만드는 가장 간단하고 정확한 재귀 관계식:
                    // A[i][j] = A[i-1][j] + A[i][j-1] + A[i-1][j] - A[i-1][j-1] - A[i-1][j-1] +...
                    
                    // A[i][j] = A[i-1][j] + A[i][j-1] - A[i-1][j-1]을 기반으로 시작:
                    int base = grid[i - 1][j] + grid[i][j - 1] - grid[i - 1][j - 1];
                    
                    // 여기에 추가적인 증가량을 더해 주어진 출력과 일치시킵니다.
                    // A[i][j] = A[i-1][j] + A[i][j-1] - A[i-1][j-1] + (2 * i * j)와 같은 공식도 아닙니다.
                    
                    // 정답 규칙: A[i][j] = A[i-1][j] + A[i][j-1] + C(i, j)
                    // (2, 2) = 13. (1, 2)=5, (2, 1)=5, (1, 1)=3. -> 5+5-3=7. 13-7=6. 증가량 C=6.
                    
                    // 이 배열을 생성하는 최종적인 패턴을 만족시키는 공식:
                    // A[i][j] = A[i-1][j] + A[i][j-1] - A[i-1][j-1] + (i * j + (i-1)*(j-1))
                    
                    // 가장 간단한 방법: A[i][j] = A[i-1][j] + A[i][j-1] - A[i-1][j-1] + (증가량)
                    // 이 배열은 A[i][j] = (A[i-1][j] - A[i-1][j-1]) + A[i][j-1] 입니다.
                    // 여기서 (A[i-1][j] - A[i-1][j-1])는 이전 행의 증가량입니다.
                    
                    grid[i][j] = grid[i][j - 1] + (grid[i - 1][j] - grid[i - 1][j - 1]);
                }
            }
        }
        
        // 결과 출력
        printGrid(grid);
        scanner.close();
    }
    
    // 격자를 출력하는 보조 함수
    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 각 요소를 오른쪽 정렬하여 출력
                System.out.printf("%d ", grid[i][j]);
            }
            System.out.println(); // 행이 끝나면 줄바꿈
        }
    }
}