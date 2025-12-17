import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       char C  = sc.next().charAt(0);
       int N = sc.nextInt();
       
       for(int i = 1; i<=N; i++){
        if(C == 'A'){
            System.out.print(i+" ");
        }
       }

        for(int i = N; i>=1; i--){
        if(C == 'D'){
            System.out.print(i+" ");
        }
       }
    }
}