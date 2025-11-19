import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int prod = 1;

        // 1 2 3 4 5 6 7 8 9 10
        for(int i=1; i<=b; i++){
            if(i%a==0){
                prod *= i;
            }
        } 
        System.out.print(prod);
    }
}