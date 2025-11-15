import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 0 0 0 26 22 30
        if(a>=b && a>=c){
            if(b>c)
                System.out.print(b);
            else
                System.out.print(c);
        }else if((a <= b && a >= c) || (a >= b && a <= c)){
            if(b>c)
                System.out.print(c);
            else
                System.out.print(b);
        }
    }
}