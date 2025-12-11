import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];
    
        // 배열1 입력
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 배열2 입력
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        //배열 곱
        int m = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m = arr[i][j] * arr2[i][j];
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }   
}