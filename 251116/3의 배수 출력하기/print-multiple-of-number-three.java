import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=1;

        while(i<=n){
            i%3==0;
            i++;
            System.out.print(i + " ");
        }
    }
}