import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
      int num;

        while(sc.hasNextInt()){
            num = sc.nextInt();
            if( (num % 2) != 0 && (num % 3) == 0) {
                System.out.printf("%d\n", num);
            }
        }
        sc.close()
    }
}