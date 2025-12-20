import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n을 입력받습니다.
        int n = sc.nextInt();
        int num = 0;
        String numStr;

        // 숫자를 입력받아 숫자들의 합을 구합니다.
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            num += a;
        }

        // 더한 값을 문자열로 바꿉니다.
        numStr = Integer.toString(num);
        
        // 문자열을 좌측으로 한 칸 밉니다.
        numStr = numStr.substring(1) + numStr.substring(0, 1);
        
        // 구하고자 하는 문자열을 출력합니다.
        System.out.println(numStr);
    }
}

