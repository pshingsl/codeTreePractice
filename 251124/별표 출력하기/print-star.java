import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // n은 5이다. 0~4 까지 반복 5줄 출력
        for(int i = 1; i <= n; i++){
            // 0~4 까지 별출력  
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }    
            System.out.println();
        }

          for(int i = n-2; i >=0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }    
            System.out.println();
        }
    }
}