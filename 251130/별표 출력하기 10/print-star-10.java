import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. n = int(input()) 구현
        int n = sc.nextInt();
        
        // 2. 초기 변수 설정
        int x = 1;
        int y = n;
        
        // 3. for i in range(2 * n): 구현
        // 총 2 * n 번 반복 (i는 0부터 시작)
        for (int i = 0; i < 2 * n; i++) {
            
            // 4. 홀수 번째 행 (i % 2 != 0) : 별의 개수가 감소
            if (i % 2 != 0) {
                // for _ in range(y): print("*", end=" ") 구현
                for (int j = 0; j < y; j++) {
                    System.out.print("* ");
                }
                
                // print() 구현 (줄바꿈)
                System.out.println();
                
                // y -= 1 구현
                y--;
                
            // 5. 짝수 번째 행 (else) : 별의 개수가 증가
            } else {
                // for _ in range(x): print("*", end=" ") 구현
                for (int j = 0; j < x; j++) {
                    System.out.print("* ");
                }
                
                // print() 구현 (줄바꿈)
                System.out.println();
                
                // x += 1 구현
                x++;
            }
        }
        
        sc.close();
    }
}