import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

        // 11 13 15 17 = 12-1 14-1 16-1 18-1 
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            System.out.print(11 + (i - 1) * 2 + (j - 1) * 2 + " "); 
        }
            System.out.println(); 
       }
    }
}