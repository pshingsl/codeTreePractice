import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        int re = (int)ch1 + (int)ch2;
        int re1 = (int)ch2 - (int)ch1;

        // 76 + 101
        System.out.print(re + " " );
        // 101 - 76
        System.out.print(re1);
    }
}