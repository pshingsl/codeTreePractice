import java.util.*;
public class Main {
    public static void main(String[] args) {
       
       // 정수형 변수를 2개를 받는다
       // a>b -> a*b b>a -> b/a

       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       if(a>b) 
        System.out.println(a*b);
       else
       System.out.println(b/a);
    }
}