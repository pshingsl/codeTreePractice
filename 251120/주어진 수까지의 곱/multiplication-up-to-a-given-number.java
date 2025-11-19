import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 1;

        // 3 4 5 6
        for(int i=a; i<=b; i++){
            prod *= i;
        }
        System.out.print(prod);
    }
}