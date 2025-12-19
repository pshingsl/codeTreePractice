import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();

        str = str.toLowerCase();

        for(int i = 0; i < len; i++) {
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }

        }
    }
}
