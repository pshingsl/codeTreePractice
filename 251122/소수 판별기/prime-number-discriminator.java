import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       boolean satis = true;

       for(int i =2; i<n; i++){
        if(n%i==0){
            satis = false;
        }
       }
       
       if(satis == false){
        System.out.print("C");
       }else{
        System.out.print("P");
       }
    }
}