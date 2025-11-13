import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt()  + 8;  
        int height = sc.nextInt() * 3;

        System.out.println(weight);
        System.out.println(height);
        System.out.println((weight * height));
    }
}