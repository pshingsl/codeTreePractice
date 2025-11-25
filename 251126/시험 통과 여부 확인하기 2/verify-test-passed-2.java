import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        int arr[] = new int[4];

     
        for (int i = 0; i < n; i++) {
                int sum = 0;
            for (int a = 0; a < 4; a++) {
                arr[a] = sc.nextInt();
                sum += arr[a];
            }

            double avg = (double) sum / 4;

            if (avg >= 60) {
                cnt ++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(cnt);

    }
}