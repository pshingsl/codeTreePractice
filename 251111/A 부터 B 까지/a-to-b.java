import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 2<=13 2,3,4,5,6,7,8,9,10,11,12,13

        // 조건대로 출력하려면 else 끝나고 출력하면 안됨 -> 조건문을 검사 다하고 그때 부터 출력함
        while(a<=b){
              System.out.print(a+" ");
            if(a%2==0){
                a+=3;
            }else{
                a*=2;
            }
        }
    }
}