import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        // cnt는 0이 아닌 유효한 숫자의 개수이자, 다음에 숫자가 들어갈 인덱스를 저장
        int cnt = 0; 
        int sum = 0;
        
        // 1. 입력 및 cnt 계산 (cnt는 0이 입력된 인덱스 = 유효 숫자의 개수)
        for(int i = 0; i < 100; i++) {
            int input = sc.nextInt();
            
            if(input == 0) {
                // 0이 입력되면, i가 유효 숫자의 개수가 됩니다.
                cnt = i; 
                break;
            }
            arr[i] = input;
        }

        // 2. 합계 계산
        
        // cnt가 3 이상일 때만 가장 최근 3개의 숫자를 더합니다.
        if (cnt >= 3) {
            // 가장 최근 3개의 숫자는 인덱스 (cnt-3), (cnt-2), (cnt-1)에 있습니다.
            sum = arr[cnt - 1] + arr[cnt - 2] + arr[cnt - 3];
        } 
        // cnt가 3 미만일 때는, 문제의 요구사항에 따라 
        // (만약 모든 유효 숫자의 합을 구해야 한다면) 다른 로직을 사용해야 합니다.
        // 현재는 '기본 문법으로 배열의 범위를 벗어나지 않게' 하는 것에 중점을 두어,
        // 3개 미만이면 0으로 처리하거나, 유효한 숫자만 더하도록 로직을 추가할 수 있습니다.
        
        // 여기서는 유효한 숫자만 더하는 로직을 기본 문법으로 구현합니다.
        else {
            // cnt가 0, 1, 2일 때
            for (int i = 0; i < cnt; i++) {
                sum += arr[i];
            }
        }
        
        // 3. 결과 출력
        System.out.println(sum);
        
        sc.close();
    }
}