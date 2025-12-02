import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 9;
        for(int i = n; i>=1 ; i--){
            System.out.pritn(cnt);
            cnt--;
        }
    }
}