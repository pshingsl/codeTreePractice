import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       a+=b; // a = 1+3;
       b+=a; // b = 3+4

       System.out.print(a+ " "+b);
    }
}