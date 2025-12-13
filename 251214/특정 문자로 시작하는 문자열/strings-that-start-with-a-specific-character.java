import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        char ch = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {
            if (ch == str[i].charAt(0)) {
                cnt++;
                sum += str[i].length();
            }
        }
        double avg = (double) sum / cnt;
        System.out.printf("%d %.2f", cnt, avg);
    }
}
