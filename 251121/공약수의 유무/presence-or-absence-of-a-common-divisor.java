import java.util.Scanner;

public class Main {
    // 1920과 2880의 최대 공약수 (GCD) 값
    private static final int GCD_VAL = 960; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            // ✅ 수정 1: i가 960의 약수(즉, 공약수)인지 확인하도록 조건을 변경합니다.
            if (GCD_VAL % i == 0) { 
                // ✅ 수정 2: 공약수를 찾았으므로 satisfied를 true로 변경합니다.
                satisfied = true; 
                // 루프 내에서 1을 출력할 필요는 없습니다. (루프 밖의 satisfied를 이용할 것이므로)
                break; 
            }
        }
        
        // 루프 내에서 satisfied가 true로 변경되었다면 1을 출력합니다.
        if (satisfied) { 
            System.out.println(1);
        }
        // 그렇지 않다면 0을 출력합니다.
        else { 
            System.out.println(0); 
        }
        sc.close();
    }
}