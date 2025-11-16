import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       // n의 배수를 5개씩 출력 
       for(int i=n; i<=n*5 ;i+=n){
            System.out.print(i + " ");
       }
    }
}