import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // i=2; i<=13; 2 5 10 13
        for(int i = a; i<=b;) {
                System.out.print(i+ " ");
            if(i%2==0){
                i+=3;
            }else{
                i*=2;
            }
        }

       }
    }