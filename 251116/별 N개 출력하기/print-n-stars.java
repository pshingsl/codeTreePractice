import java.util.Scanenr;

public class Main {
    public static void main(String[] args) {
       
        Scanenr sc = new Scanenr(System.in);

        int n = sc.nextInt();

        int i=1;

        while(i<=5){
            System.out.println("*");
            i++;
        }
    }
}