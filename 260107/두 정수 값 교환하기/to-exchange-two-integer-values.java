import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        swap(n, m);
        System.out.print(m+" "+n);
    }
    public static void swap(int a, int b){
        int tmp = 0;
        tmp = a; // a= 13 b = 8
        a = b;
        b = a;
       // System.out.print(a+" "+b);
    }
}