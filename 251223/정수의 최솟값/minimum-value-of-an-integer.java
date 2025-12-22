import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c){
        int small = a;
        if(a<b){
            if(a<c){
                return a;
            }
        } else if(b<c){
            return b;
        } else {
            return c;
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(min(a, b, c));
    }
}