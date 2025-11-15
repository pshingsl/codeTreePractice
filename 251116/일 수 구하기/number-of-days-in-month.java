import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       if(1<=n && n<=12){
            if(n==2){
                System.out.print(28);
            }else{
                System.out.print(31);
            }
       }else{
        System.out.print(31);
       }
    }
}