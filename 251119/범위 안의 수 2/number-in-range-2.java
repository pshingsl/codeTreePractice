import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sum=0;
       double avg=0;
       double cnt=0;

       for(int i=0; i<10; i++){
        double a = sc.nextInt();
        if(a>=0 && a<=200){
            sum+=a;
            cnt++;
        }
       }
       avg = (double)sum/cnt;
       System.out.printf("%d %.1f", sum, avg);
    }
}