import java.util.Scanner;

public class Main {
    public static int mu(int a, int b){
        int mul = a;
        for(int i =1; i < b; i++){
            mul *= a;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(mu(a, b));
    }
}