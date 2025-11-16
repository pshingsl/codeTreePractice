import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       char ch = sc.next().charAt(0);
       int n = sc.nextInt();

       for(int i=1; i<=n; i++){
        if(ch=='A')
            System.out.print(i+" ");
       }

        for(int i=n; i>=1; i--){
        if(ch=='D')
            System.out.print(i+" ");
       }
    }
}