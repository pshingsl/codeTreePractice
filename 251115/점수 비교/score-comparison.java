import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int amath = sc.nextInt();
        int aEng = sc.nextInt();
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        if(amath > bMath && aEng > bEng){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}