import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];
        int n = sc.nextInt();
        int cnt = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = cnt*cnt;
                System.out.print(arr[i][j + " "]);
            }
            System.out.println();
        }
    }
}