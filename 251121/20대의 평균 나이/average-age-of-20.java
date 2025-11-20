import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double sum = 0;
       double avg = 0;
       int cnt = 0;

       while(true){
        int n = sc.nextInt();

        if(n<20 || n>29){
            System.out.printf("%.2f", sum/cnt);
            break;
        }
        sum+=n;
        cnt++;
       }
    }
}