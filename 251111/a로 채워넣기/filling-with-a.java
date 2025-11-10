import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        // 앞에서 2번째 원소 'a' 변환

        str = str.substring(0, 1) + "a"+ str.substring(2); // laebroscode

        // str = str.substring(len-2); -> de

        // 맨 뒤에서 2번째 원소 'a' 변환
        str = str.substring(0, len-2) + "a" + str.substring(len-1);
         System.out.println(str);
    }
}