import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        for(int i = 0; i < str1.length(); i++){

            boolean x = true;
            for(int j = 0; j < str2.length(); j++){
                if(str1.charAt(i+j) != str2.charAt(j)){
                    x = false;
                    break;
                }
            }
             if(x==true){
                cnt++;
                }
        }
         System.out.print(cnt);
    }
}

