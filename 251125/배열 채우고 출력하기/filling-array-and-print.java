import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       char[] arr = new char[10];

       for(int i = 0; i < arr.length; i++){
        char ch = sc.next().charAt(0);
        arr[i] = ch;
       }

       for(int i = 9; i>=0; i--){
        System.out.print(arr[i]);
       }
    }
}