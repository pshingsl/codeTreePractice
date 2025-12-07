import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄: n을 입력받습니다. (배열의 크기)
        int n = Integer.parseInt(br.readLine());

        // 두 번째 줄: 배열의 요소들을 입력받습니다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // n 크기의 정수 배열을 생성합니다.
        int[] arr = new int[n];
        
        // 배열에 요소들을 채워 넣습니다.
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // --- 파이썬 로직 구현 ---
        
        // 1. 초기값 설정: minus = max(arr)
        // 배열 arr의 최대값을 초기 최소 차이값(minus)으로 설정합니다.
        // 최대 차이값은 배열의 최대값과 최소값의 차이이므로, 최대값(max(arr))만으로 초기화하면 안 됩니다.
        // 문제의 로직을 그대로 구현하기 위해 max(arr)로 초기화하지만,
        // 실제로는 가능한 최대 차이값 (예: Integer.MAX_VALUE)으로 초기화하는 것이 더 적절합니다.
        // 여기서는 파이썬 코드를 따른 대로 일단 max(arr)를 구합니다.
        
        // 배열 arr에서 최대값을 찾습니다.
        int minus = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] > minus) {
                minus = arr[i];
            }
        }
        
        // 2. 이중 반복문을 통해 최소 차이를 찾습니다.
        // i는 0부터 n-1까지
        for (int i = 0; i < n; i++) {
            // j는 i+1부터 n-1까지 (j > i 조건을 만족)
            for (int j = i + 1; j < n; j++) {
                // arr[j] - arr[i]를 계산합니다.
                int currentDiff = arr[j] - arr[i];
                
                // 현재 차이가 기존의 최소 차이(minus)보다 작으면 갱신합니다.
                if (currentDiff < minus) {
                    minus = currentDiff;
                }
            }
        }

        // 최종 최소 차이값을 출력합니다.
        System.out.println(minus);
    }
}