import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. N과 기준 문자 ch 입력
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        
        // 배열 크기를 N에 맞춥니다.
        String[] arr = new String[n]; 

        int cnt = 0;
        int sum = 0;

        // 2. 반복문 조건을 'n'에 맞게 수정 (i < 4 -> i < n)
        for(int i = 0; i < n; i++){ 
            arr[i] = sc.next();
            if(arr[i].charAt(0) == ch){
                cnt++;
                sum += arr[i].length();
            }
        }
        
        // 3. 평균 계산 시 나누는 값을 'cnt'로 수정 (4 -> cnt)
        // cnt가 0이 아닐 때만 평균을 계산합니다. (문제의 예제에서는 항상 cnt > 0)
        double avg = 0;
        if (cnt > 0) {
             avg = (double)sum / cnt; 
        }

        // 출력 형식은 동일하게 유지
        System.out.printf("%d %.2f", cnt, avg);
        sc.close();
    }
}