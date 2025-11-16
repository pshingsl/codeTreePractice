import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       // a이상 b까지 홀수 출력
       // a=1, b=9 1~9까지 홀수 출력 1 3 5 7 9
       for(int i=a; i<=b; i+=2){
        System.out.print(i+ " ");
       }
    }
}