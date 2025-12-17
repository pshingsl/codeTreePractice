import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eE = 0;
        int eB = 0;

        String str = sc.next();

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'e')
                eE++;

            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'b')
                eB++;
        }
        System.out.print(eE + " " + eB);
    }
}