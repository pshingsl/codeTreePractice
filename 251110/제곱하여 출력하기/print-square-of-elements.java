import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 3

        int[] arr = new int[a]; // 입력한 a 수만큼 길이 지정

        for(int i=0; i<arr.length; i++) {
            // 1 8 5 입력
            arr[i] = sc.nextInt();

            // 1 8 5 출력
            // System.out.print(arr[i]+ " ");
            // 각 인덱스 제곱
            arr[i] *= arr[i];

            System.out.print(arr[i]+ " ");
        }

    }
}