import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        n = sc.nextInt();
        int cnt = 0;

        while(true) {
            // n이 1이 될 때까지 홀수일 때는 n = 3n+1을, 짝수일 때는 n = n/2를 반복합니다.
            if(n == 1)
                break;
            
            if(n % 2 == 1)
                n = 3 * n + 1;
            else
                n = n / 2;
            
            cnt++;
        }

        System.out.println(cnt);
    }
}
