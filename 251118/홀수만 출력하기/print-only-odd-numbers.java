import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++){
            if (a[j] % 2 == 1 && a[j] % 3 == 0){
                System.out.println(a[j]);
            }
        }
    }
}

