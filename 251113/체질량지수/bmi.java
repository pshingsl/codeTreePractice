import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int re = (10000*w) / (h*h);

        if(re >= 25){
            System.out.println(re);
            System.out.print("Obesity");
        }

        if(re < 25){
             System.out.println(re);
        }
    }
}