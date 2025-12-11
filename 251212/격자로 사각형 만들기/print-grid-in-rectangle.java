import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 제한 조건: 2 <= N <= 10
       
        int N = scanner.nextInt();
        
        // N x N 크기의 2차원 배열 (long 타입 권장: N이 커지면 값이 빠르게 증가함)
        long[][] grid = new long[N][N];

        // 1. 이중 반복문을 사용하여 격자 채우기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                
                // 첫 행 (i=0) 또는 첫 열 (j=0)은 모두 1
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                } 
                
                // 나머지 칸들은: 바로 위(A[i-1][j]) + 바로 왼쪽(A[i][j-1]) + 왼쪽 위(A[i-1][j-1])의 합
                else {
                    grid[i][j] = grid[i - 1][j] + grid[i][j - 1] + grid[i - 1][j - 1];
                }
            }
        }
        
        // 2. 결과 출력
        printGrid(grid);
        scanner.close();
    }
    
    // 격자를 출력하는 보조 함수
    public static void printGrid(long[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 각 수를 공백으로 구분하여 출력
                System.out.printf("%d ", grid[i][j]);
            }
            System.out.println(); // 행이 끝나면 줄바꿈
        }
    }
}