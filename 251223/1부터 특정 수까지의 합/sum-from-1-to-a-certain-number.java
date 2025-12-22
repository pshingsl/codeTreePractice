import java.util.Scanner;

public class Main {
     public static int avg(int n) {
        int sum = 0;
        for(int i =1; i<=n; i++)
            sum += i;
            return sum / 10;
        
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ag = avg(n);
        System.out.print(ag);
    }
}