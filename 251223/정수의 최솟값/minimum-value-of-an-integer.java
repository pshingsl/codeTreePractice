import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c){
        int small = a;
        if(small<b){
            if(small<c){
                return small;
            }
        } else if(b<c){
            small = b;
            return small;
        } else {
            small = c;
            return small;
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