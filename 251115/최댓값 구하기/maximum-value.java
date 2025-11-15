import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        // a b c 다 비교해서 최댓갑 구하기
        if(a>=b){
            if(a>=c){
                System.out.print(a);
            }
        }

        if(b>=a){
            if(b>=c){
                System.out.print(b);
            }
        }

        if(c>=a){
            if(c>=b){
                System.out.print(c);
            }
        }
        }
    }