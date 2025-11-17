import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        // 0일 기점으로 2일마 다 교실청소, 3일마다 복도, 12일마다 화장실 날짜가 겹치는 날에는 주기가 긴 것
        // 6일이랑 12일이 겹침 6일이때 cnt1=3 cnt2=2
        // 12일이면 cnt1=6, cnt2=4

        for(int i=1; i<=n; i++){
            if(i%12==0){
                cnt3++;
            }else if(i%3==0){
                cnt2++;
            }else if(i%2==0){
                cnt1++;
            }
        }
        System.out.print(cnt1 +" "+ cnt2 + " " +cnt3);
    }
}