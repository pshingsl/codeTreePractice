import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=1;

        // N까지 3의 배수로 출력 
        while(i<=n){ // 1~27 
                i++;
            if(i%3==0)
                System.out.print(i+" ");
        }
    }
}