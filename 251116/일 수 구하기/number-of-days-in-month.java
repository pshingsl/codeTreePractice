import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       
       // 31: 1, 3, 5, 7, 8, 12
       // 30: 4, 6, 9
       if(1<=n && n<=12){
            if(n==2){
                System.out.print(28);
            }else if(n==1 || n == 3 || n==5 || n==7 || n==8 || n==12){
                System.out.print(31);
            }
       }else{
        System.out.print(30);
       }
    }
}