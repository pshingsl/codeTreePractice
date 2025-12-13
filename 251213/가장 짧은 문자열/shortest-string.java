import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        // a가 큰 경우  a>b a>c 
        // b가 큰 경우  b>a b>c 
        // c가 큰 경우  c>a c>b 
        if(str1.length() > str2.length() && str1.length() > str3.length()){
            if(str2.length()>str3.length()){
                System.out.print(str1.length() - str3.length());
            }else{
                System.out.print(str1.length() - str2.length());
            }
        }else if(str2.length() > str1.length() && str2.length() > str3.length()){
            if(str1.length()>str3.length()){
                System.out.print(str2.length() - str3.length());
            }else{
                System.out.print(str2.length() - str1.length());
            }
        }else{
            System.out.print(str3.length() - str1.length());
        }
    }
}