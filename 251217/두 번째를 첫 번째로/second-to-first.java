import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str = sc.next();

       char arr[] = str.toCharArray();

        char temp = ' ';
        temp = arr[1];

       for(int i=0; i<arr.length; i++){
            if(arr[i]==temp) {
                arr[i]=arr[0];
            }  
            
            
       }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }



    }
}
