import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int i=n;

       while(i<=100){
        if(n>=90){
            System.out.print("A" + " ");
            i++;
        } else if(n>=80) {
            System.out.print("B" + " ");
            i++;
        } else if(n>=70) {
            System.out.print("C" + " ");
             i++;
        } else if(n>=60) {
            System.out.print("D" + " ");
             i++;
        } else {
            System.out.print("E" + " ");
             i++;
        }
       }
    }
}