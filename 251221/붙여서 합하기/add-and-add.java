import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String re1 = str1 + str2;
        String re2 = str2 + str1;

        int n1 = Integer.parseInt(re1);
        int n2 = Integer.parseInt(re2);

        System.out.print(n1 + n2);
    }
}