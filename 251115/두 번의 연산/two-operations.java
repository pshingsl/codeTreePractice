import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // A가 홀수이면 A+3 
        if(a%2==1){
            a += 3;
        }

        // A가 3의 배수라면 3으로 나누어준다.
        if(a%3==0){
            a /=3;
        }

        System.out.print(a);
    }
}