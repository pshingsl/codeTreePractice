import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             // 변수 선언
        int n = sc.nextInt(); // 학생 수
        int cnt = 0;
        int sum = 0;

        // 정수 10개 입력받을 배열 생성
        int arr[] = new int[4];

        // 배열에 정수 입력받기
        for (int i = 0; i < n; i++) {
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