import java.util.Scanner;

public class Main {
    public static final int MAX_N = 50;

    public static int n;
    public static int[] arr = new int[MAX_N];

    public static void modify(int[] arr) {
        for(int i = 0; i < n; i++)
            if(arr[i] % 2 == 0)
                arr[i] /= 2;
    }

    public static void main(String[] args) {
        // 변수 선언 및 입력:
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        modify(arr);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
