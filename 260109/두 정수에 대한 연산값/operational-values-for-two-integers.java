import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(sum(a,b));
    }

    public static String sum(int a, int b){
        if(a>b){
            return a + " " + (a+25);
        }else{
            return b + " " + (b+25);
        }

    }
}