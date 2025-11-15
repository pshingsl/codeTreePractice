import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        // 8 -5 10 
        if(a <= b && a <= c){
            System.out.print(a);
        }else if(b<=a && b<=c){
            System.out.print(b);
        }else{
            System.out.print(c);
        }
    }
}
