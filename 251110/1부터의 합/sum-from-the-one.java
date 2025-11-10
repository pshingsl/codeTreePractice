import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 5 -> 1+2+3 -> 3으로 출력 

        int sum = 0;
        for(int i=1; i<101; i++) {
            sum +=i;

            // 6 > 5
            if(sum>=n){
                System.out.println(i);
                break;
            }
        }
    }
}