import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i<=b; i++){
            if(!check(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static boolean check(int a) {
        if(a%2==0)
            return true;
        if(a%10==5)
            return true;
        if(a%3==0 && a%9!=0)
             return true;

        return false;
    }
}