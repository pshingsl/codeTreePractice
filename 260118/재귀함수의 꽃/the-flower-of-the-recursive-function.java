import java.util.Scanner;
public class Main {
    public static void printNum(int  n){
        for(int i = n; i > 0; i--){
            System.out.print(i +" ");
        }

        for(int i = 1; i <n+1; i++){
                System.out.print(i + " ");
             }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
}