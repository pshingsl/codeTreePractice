import java.util.Scanner;

public class Main { 
     public static void printNum(int n, int m){
        int cnt = 0;
        for(int i = 1; i<=100; i++){
            if(i%n==0 && i%m==0){
                cnt = i;
            }
        }
        System.out.print(cnt);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printNum(n, m)
    }
}