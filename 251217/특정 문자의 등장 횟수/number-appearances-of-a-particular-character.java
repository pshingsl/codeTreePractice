import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eE = 0;
        int eB = 0;

        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            if(str.contains("ee"))
                eE++;
            
            if(str.contains("eb"))
                eB++;
        }
        System.out.print(eE + " " + eB);
    }
}