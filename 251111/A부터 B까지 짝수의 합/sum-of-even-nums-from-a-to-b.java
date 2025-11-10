import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 2
        int b = sc.nextInt(); // 5

        int total = 0;

        // 2, 3, 4, 5
        for(int i=a; i<=b; i++){
            // 짝수를 구하여라
            if(i%2==0){
                // 짝수의 합
                total +=i;
                continue;
            }
        }
        System.out.print(total);
    }
}