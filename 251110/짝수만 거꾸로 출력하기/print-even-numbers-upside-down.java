import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수의 개수 n을 입력받습니다.
        int n = sc.nextInt();

        // 변수를 선언합니다.
        int[] arr = new int[100];

        // 배열에 정수들을 차례로 입력받습니다.
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 입력받은 수들을 거꾸로 보면서 짝수인 값만 출력합니다.
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
