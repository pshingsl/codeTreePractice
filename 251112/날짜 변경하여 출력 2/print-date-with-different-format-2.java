import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("-"); // 5-26-1994 5 26 1994분리

        System.out.print(arr[2]+"."+ arr[0] +"." + arr[1]);
    }
}
