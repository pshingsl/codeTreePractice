import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt(); 
        int b  = sc.nextInt(); 

       for (int x = 0; x < 10; x++) {
            
            // 3. 짝수/홀수 판별: if x % 2 == 0: 구현
            if (x % 2 == 0) {
                // print(a, end=" ") 구현
                System.out.print(a + " ");
                
                // a = b + 2 * a 구현
                a = b + 2 * a;
            } else {
                // print(b, end=" ") 구현
                System.out.print(b + " ");
                
                // b = a + 2 * b 구현
                b = a + 2 * b;
            }
        }
    }
}