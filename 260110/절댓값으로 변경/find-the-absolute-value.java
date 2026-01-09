import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] copy = arr.clone();
        Arr(copy);
        for(int i = 0 ; i < n; i++){
            System.out.print(copy[i] + " ");
        }
    }

    public static void Arr(int arr[]){
        for(int i=0; i < arr.length; i++){
            arr[i] = Math.abs(arr[i]);
        }
    }
}