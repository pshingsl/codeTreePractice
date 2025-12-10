import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int arr[][] = new int[2][4];
       int sum = 0;

       for(int i = 0; i < 2; i++){
        for(int j = 0; j < 4; j++){
            arr[i][j] = sc.nextInt();
        }
       }

       for(int i = 0; i < 2; i++){
        int sum = 0;
        for(int j = 0; j < 4; j++){
            sum += arr[i][j];
            System.out.printf("%.1f ", (double)sum/4);
        }
       }

        for(int i = 0; i < 4; i++){
        int sum = 0;
        for(int j = 0; j < 2; j++){
            sum += arr[i][j];
            System.out.printf("%.1f ", (double)sum/2);
        }
       }
        
       for(int i = 0; i < 4; i++){
        for(int j = 0; j < 2; j++){
            sum += arr[i][j];
            System.out.printf("%.1f ", (double)sum/8);
        }
       }
    }
}
