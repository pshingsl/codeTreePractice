import java.util.Scanner;

public class Main {
    public static void printMin(int a, int b){
        int gcd = 0;
        for(int i = Math.max(a,b); i <= a*b; i++){
            if(i%a==0 && i%b==0){
                  System.out.print(i);
                  break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMin(n, m);
    }
}