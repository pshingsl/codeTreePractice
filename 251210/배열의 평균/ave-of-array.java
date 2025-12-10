import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        
        for(int i = 0; i < 2; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}