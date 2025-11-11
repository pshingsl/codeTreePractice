import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       // 0 1 2 -> 3번 반복
       for(int i=0; i<n; i++){
        // 안쪽에서는 1 3 5 -> 3번 반복 -> 홀수 형태로 출력
        // 0 1 2
        for(int j=0; j<2*i+1; j++){
            System.out.print("*");
        }
          System.out.println();
       }    
    }
}