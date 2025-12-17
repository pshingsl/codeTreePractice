import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str = sc.next();

       char arr[] = str.toCharArray();
       
      char x =arr[0];
      char y = arr[1];
       for(int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                arr[i]=y;
            }
            else if(arr[i]==y){
                arr[i]=x;
            }
        
            System.out.print(arr[i]);
       }    

    

    }
}
