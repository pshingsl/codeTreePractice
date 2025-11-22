import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean satis = true;

        for(int i=1; i<=5; i++){
            int a = sc.nextInt();
       
            if(a%3!=0){
                satis = false;
            }
        }
        
        if(satis == false){
            System.out.print("0");
        }else{
            System.out.print("1");
        }
    }
}