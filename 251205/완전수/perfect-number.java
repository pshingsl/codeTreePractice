import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. start와 end 입력 받기
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        // 2. 완전수의 총 개수를 저장할 카운터
        int perfectCount = 0;
        
        // 3. 외부 루프: start부터 end까지 모든 수 i를 순회
        for (int i = start; i <= end; i++) {
            // 4. i가 완전수인지 판별하기 위해, 약수의 합계를 저장할 변수를 초기화
            // 진약수의 합을 구하기 때문에, '1'은 모든 수의 약수이므로 sum을 1로 초기화하고
            // 내부 루프는 2부터 시작해도 됩니다.
            // 하지만 여기서는 코드를 직관적으로 만들기 위해 0으로 초기화하고 1부터 검사합니다.
            int sumOfDivisors = 0; 

            // (주의: 1은 진약수가 없으며 완전수도 아닙니다. 28의 예시처럼 1은 28 미만의 약수입니다.)
            // 문제의 정의(진약수의 합)를 따르기 위해, i-1까지 검사해야 합니다.
            // 최적화를 위해 i/2까지만 검사하고, 1을 미리 더하는 방법도 있습니다.
            
            // 5. 내부 루프: 1부터 i-1까지 돌면서 i의 약수를 찾고 합계를 계산
            // j는 i의 약수가 될 수 있는 후보입니다.
            for (int j = 1; j < i; j++) {
                // j가 i의 약수인지 확인 (i를 j로 나눈 나머지가 0인지 확인)
                if (i % j == 0) {
                    sumOfDivisors += j; // 약수라면 합계에 누적
                }
            }
            
            // 6. 완전수 판별
            // 진약수의 합(sumOfDivisors)이 원래 수(i)와 같으면 완전수입니다.
            if (sumOfDivisors == i) {
                perfectCount++;
                // (선택) 어떤 완전수를 찾았는지 확인하고 싶다면: 
                // System.out.println(i + "는 완전수입니다.");
            }
        }
        
        // 7. 최종 결과 출력
        System.out.println(perfectCount);
        
        sc.close();
    }
}