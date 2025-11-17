import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int cnt = 0;
       int cnt1= 0;

       // 윤년 총 횟수
       // 윤년은 4로 나누어 떨어짐 
       // 100으로 나누어 떨어지면서 400으로 떨어지지 않음 
       // 다 4의 배수 
       for(int i=1; i<=n; i++){
        if(i%4==0){
          cnt++;
          if(i%100==0 && i%400!=0)
          cnt--;
        }
       }
       System.out.print(cnt);
    }
}