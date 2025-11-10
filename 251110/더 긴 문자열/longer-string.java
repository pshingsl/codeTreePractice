import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        // System.out.println(str + " " + str2); Happy Coding
        
        //System.out.println(str.length() + " " + str2.length()); 5, 6

        if(str.length() > str2.length()) {
            System.out.println(str + " " + str.length());
        } else if(str.length() == str2.length()){
            System.out.println("same");
        }else{
            System.out.println(str2+ " " +str2.length());
        }
    }
}