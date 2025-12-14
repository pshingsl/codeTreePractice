import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String encoded = "";

        for(int i = 1; i < str.length(); i+=2){
            encoded += str.charAt(i);
        }

        for(int i = encoded.length() - 1; i >=0 ; i--){
            System.out.print(encoded.charAt(i));
        }
    }
}
