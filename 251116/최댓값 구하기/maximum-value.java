import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        // a b c 다 비교해서 최댓갑 구하기 a>b a>c b>a b>c c>a c>b
        // 1 1 0  11
        if(a>b){
            if(a>c)
                System.out.println(a);
        }

         if(b>a){
            if(b>c)
                System.out.println(b);
        }

         if(c>a){
            if(c>a)
                System.out.println(c);
        }

            }
        }
    