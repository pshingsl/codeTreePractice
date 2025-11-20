import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=100; i++){
           int a = sc.nextInt();

        if(a < 25){
            System.out.println("Higher");
        }else if(a > 25){
            System.out.println("Lower");
        }else{
            System.out.println("Good");
            break;
        }
        }
    }
}