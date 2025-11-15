import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int age = sc.nextInt();

        // s가 0이면서 
        if(s==0){
            if(age>=19)
             System.out.print("MAN");
            else
             System.out.print("BOY");
        }else if(s==1){
             if(age>=19)
             System.out.print("WOMAN");
            else
             System.out.print("GIRL");
        }
    }
}