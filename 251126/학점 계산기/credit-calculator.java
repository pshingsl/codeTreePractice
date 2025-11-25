import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int sum = 0;
       double avg = 0;

       for(int i = 0; i < n; i++){
        double sub = sc.nextDouble();
        sum += sub;
       }
        avg = (double)sum/n;
        System.out.printf("%.1f \n", avg);

        if(avg >= 4.0){
            System.out.print("Perferct");
        } else if(avg >= 3.0) {
            System.out.print("Good");
        }else{
            System.out.print("Poor");
        }
    }
}