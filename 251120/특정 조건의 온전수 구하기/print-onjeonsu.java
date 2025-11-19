import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1 2 3 4 5 6 7 8 9 -> 1 5 7 9
        // 2: 2 4 6 8
        // 3: 3 6
        for(int i=1; i<=n; i++){
            if(i%2==0 || i%5==0 || (i%3==0 && i%9!=0))
                continue;
            
            System.out.print(i+ " ");
        }
    }
}