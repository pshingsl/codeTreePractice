import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);
        int len = str.length();
        int idx = -1;

        for(int i = 0; i < len; i++){
            if(str.charAt(i) == ch){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("No");
        }else{
            System.out.println(idx);
        }
    }
}