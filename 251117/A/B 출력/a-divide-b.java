import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        // 0번쨰 부터 21까지 반복
        for(int i=0; i<20; i++){
            a*=10;
            System.out.printf(a/b);

            a%=b;
        }
    }
}