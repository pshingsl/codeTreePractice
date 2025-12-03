import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // C 언어의 int n, i, j, k; 와 scanf("%d", &n); 구현
        int n = sc.nextInt();
        
        // C 언어의 for(i=0; i<n; i++){ 구현 (바깥쪽 루프: 행 제어)
        for (int i = 0; i < n; i++) {
            
            // C 언어의 for(k=0; k<=2*i-1; k++){ printf(" "); } 구현 (공백 출력)
            // i=0일 때: k<= -1 (실행 안됨) -> 공백 0개
            // i=1일 때: k<= 1 (k=0, 1) -> 공백 2개
            // i=2일 때: k<= 3 (k=0, 1, 2, 3) -> 공백 4개
            for (int k = 0; k <= 2 * i - 1; k++) {
                System.out.print(" ");
            }

            // C 언어의 for(j=n; j>i; j--){ printf("%d ", j - i); } 구현 (숫자 패턴 출력)
            // j는 n부터 i+1까지 감소
            for (int j = n; j > i; j--) {
                // 출력되는 값: n-i 부터 1까지 감소
                System.out.print((j - i) + " ");
            }

            // C 언어의 printf("\n"); 구현 (줄바꿈)
            System.out.println();
        }
        
        sc.close();
    }
}