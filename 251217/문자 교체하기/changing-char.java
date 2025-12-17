import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str = sc.next();
       String str2 = sc.next();

       str =  str.substring(0,3);
       str2 = str2.substring(str2.length()-3);

       System.out.print(str + str2);
    }
}