import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int a =  sc.nextInt();
       int n =  sc.nextInt();

      // 5~6 5+6 11+6 17+6 23+6 29+6 35+6
       for(int i = 1; i <= n; i+=n){
        a+=n;
         System.out.println(a);
       }
    }
}