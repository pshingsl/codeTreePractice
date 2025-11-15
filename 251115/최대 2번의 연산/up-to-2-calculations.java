import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // a가 짝수라면 2로 나눠준다  10/2 = 5
        if(a%2==0) {
            System.out.println(((a/2)/2)+1); 
        }

        // a가 홀수면 1을 더한 뒤 2로 나눠 준다. 3+1/2
        if(a%2==1) {
            System.out.println((a+1)/2);
        }
    }
}