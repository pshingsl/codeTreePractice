import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // a=5 a를 2이배수인 경우엔 B를 출력

        if(a==5){
            System.out.print("A");
        }

        if(a%2==0){
             System.out.print("B");
        }
    }
}