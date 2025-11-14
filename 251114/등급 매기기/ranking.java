import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        if(s>=90){
            System.out.print("A");
        }else if(s>=80){
            System.out.print("B");
        }else if(s>=70){
            System.out.print("C");
        }else if(s>=60){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
 }
