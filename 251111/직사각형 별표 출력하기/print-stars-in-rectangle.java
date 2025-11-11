import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int m = sc.nextInt();

       // 출력 조건에서 세로 4, 가로 2 
       // 세로는 외부 반복문, 가로는 내부 반복문이다.
       // 이중 반복문에서는 내부 반복문안에 실행문을 넣으면 내부 반복문이 1회 순회할때마다 출력함
       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}