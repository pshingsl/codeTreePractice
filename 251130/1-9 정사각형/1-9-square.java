import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        // 총 n개의 행을 출력해야하므로
        for (int i = 0; i < n; i++){
            // 총 n개의 열을 출력해야하므로
            for (int j = 0; j < n; j++){
                // cnt의 값을 10으로 나눈 나머지를 출력하면 되지 않을까?
                System.out.print(cnt%10);
                if ((cnt%10)==9){
                    // 만약에 cnt가 9.19.29... 인 경우는 +2를 해주게 되면 1이 출력되므로 그렇게 만들어주기
                    cnt= cnt+2;
                } else {
                    // 나머지 경우는 그냥 cnt 1씩 증가
                    cnt++;
                }
            }
            //개행 
            System.out.println();
        }
    }
}
