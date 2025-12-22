import java.util.Scanner;

public class Main {
     public static int plus(int a, int b){
            return a + b;
        }

        public static int minus(int a, int b){
            return a - b;
        }

        public static int multy(int a, int b){
            return a * b;
        }

        public static int divide(int a, int b){
            return a / b;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        int b = sc.nextInt();

        if(ch == '+'){
            System.out.print(a + " + " + b + " = " +plus(a,b));
        }else if(ch == '-'){
            System.out.print(a + " - " + b + " = " +minus(a,b));
        }else if(ch == '*'){
            System.out.print(a + " * " + b + " = " +multy(a,b));
        }else if(ch == '/'){
            System.out.print(a + " / " + b + " = " +divide(a,b));
        }
    }
}