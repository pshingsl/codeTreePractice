import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();
        int count = 0;

        for(int i = s; i <= e; i++){
             int cnt = 0;
            for(int j = 1; j<=i; j++){
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 3){
                count++;
            }
        }
        System.out.print(count);
    }
}