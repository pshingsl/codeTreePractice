import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       for(int i=1; i<=n; i++){
        for(int a=1; a<=n; a++){

            System.out.print(i+" * "+a+" = "+(i*a));
            if(a<n){
                System.out.print(", ");
            }
        }
        System.out.println();
       }
    }
}