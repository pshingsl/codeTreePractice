import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        
        int n1 = (int)ch1;
        int n2 = (int)ch2;
        System.out.print(n1+n2 + " ");

        if(n1>n2){
            System.out.print(n1-n2);
        }
          else{  System.out.print(n2-n1);
          }
    }
}