import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double avg = 0;

        for(int i = 0; i < 8; i++){
            int n = sc.nextInt();
            sum += n;
            System.out.println(n);
        }
    }
}