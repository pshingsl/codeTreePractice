import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        
        String[] str = new String[10];
        String strAll = "";
        
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
            strAll += str[i];
        }

        int len = strAll.length(); // 21
        
        for(int i = 0; i<len; i++){
            System.out.print(strAll.charAt(i));
            if((i+1) % 5==0){
                System.out.println();
            }
        }
     
    }
}