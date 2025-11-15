import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(3<=n && n<=5){
            System.out.print("Spring");
        }else if(6<=n && n<=8){
            System.out.print("Summer");
        }else if(9<=n && n<=11){
            System.out.print("Fall");
        }else{
            System.out.print("Winter");
        }
     
    }
}
