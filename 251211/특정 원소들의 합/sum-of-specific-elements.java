import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        // 2차원 배열 숫자 입력
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                    arr[i][j] = sc.nextInt();
            }
        }

        // 2차원 배열 색칠 총합
        int sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <=i; j++){
                    sum += arr[i][j];
            }
        }
         System.out.print(sum);
    }
}