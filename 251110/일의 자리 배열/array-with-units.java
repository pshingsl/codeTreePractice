import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr[] = new int[10];
        arr[0] = a; // 2
        arr[1] = b; // 5 

        // [2, 5, 0, 0, 0, 0, 0, 0, 0, 0]
        for(int i=2; i<arr.length; i++)
            arr[i] = (arr[i-2]+arr[i-1])%10; // 7 2 9 1 0 1 1 2 
            //System.out.print(arr[i]+" ");

            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
    }
}