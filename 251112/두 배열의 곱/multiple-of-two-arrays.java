import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열을 구현합니다.
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];

        // 첫 번째 배열의 입력을 받습니다.
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                arr1[i][j] = sc.nextInt();

        // 두 번째 배열의 입력을 받습니다.
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                arr2[i][j] = sc.nextInt();

        // 두 배열의 곱을 새로운 배열에 담습니다.
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                arr3[i][j] = arr1[i][j] * arr2[i][j];

        // 새로운 배열을 출력합니다.
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();
        }
    }
}
