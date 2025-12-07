import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n;

        while(true) {
            int max = calMax(arr, start, end);
            int idx = findIdx(arr, max);
            if(idx == 0) {
                System.out.print(idx+1 + " ");
                break;
            }
            System.out.print(idx+1 + " ");
            end = idx;
        }
    }

    public static int calMax(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for(int i=start; i<end; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findIdx(int[] arr, int max) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == max) {
                return i;
            }
        }
        return -1;
    }
}
