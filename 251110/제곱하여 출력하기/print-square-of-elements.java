import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 3

        int[] arr = new int[a];

        for(int i=0; i<arr.length; i++) {
            // 1 8 5 입력
            arr[i] = sc.nextInt();

            // 1 8 5 출력
            arr[i] *= arr[i];

            System.out.print(arr[i]+ " ");
        }

    }
}