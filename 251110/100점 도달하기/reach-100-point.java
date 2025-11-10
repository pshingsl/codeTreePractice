import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int score = sc.nextInt();

       for(int i=score; i<101; i++){
       if(score>=90) {
        ++score;
        System.out.print("A" +" ");
       }else if(80<=score && score<90){
        ++score;
        System.out.print("B" +" ");
       }else if(70<=score && score<80){
        ++score;
        System.out.print("C" +" ");
       }else if(60<=score && score<70){
        ++score;
        System.out.print("D" +" ");
       }else{
        System.out.print("E" +" ");
       }
     }
    }
}