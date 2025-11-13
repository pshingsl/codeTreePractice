import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int score = sc.nextInt();

       if(score >= 80){
        System.out.print("pass");
       }else{
        int re = 80-score;
         System.out.print(re + " more score");
       }
    }
}