import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int w = sc.nextInt();

        //기말고사 점수가  95점 이상은 10만원 90점은 5만원 
        if(s>=90 && w>=95){
            System.out.print(100000);
        }else if(s>=90 && w>=90) {
            System.out.print(50000);
        }else{
            System.out.print(0);
            
        }
    }
}
