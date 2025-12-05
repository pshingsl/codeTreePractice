import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위해 BufferedReader와 StringTokenizer 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // A와 B를 입력받습니다.
        st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken()); // A는 1000까지이므로 int로도 충분하지만, long으로 처리해도 무방합니다.
        int B = Integer.parseInt(st.nextToken());   // B는 10 이하이므로 int를 사용합니다.

        // 나머지 횟수를 저장할 배열을 초기화합니다.
        // 나머지는 0부터 B-1까지 나오므로, 크기는 B입니다.
        int[] remainderCounts = new int[B];

        // A가 1보다 클 때까지 나눗셈을 반복합니다.
        // 문제 조건: "A가 1 이하가 될 때까지"
        while (A > 1) {
            // 1. 현재 A를 B로 나눈 나머지를 구합니다.
            // A가 long 타입이므로 나머지 연산도 long으로 수행됩니다.
            int remainder = (int) (A % B);
            
            // 2. 해당 나머지의 횟수를 1 증가시킵니다.
            remainderCounts[remainder]++;
            
            // 3. A를 B로 나눈 몫으로 업데이트합니다. (정수 나눗셈)
            A = A / B;
        }

        // 최종 결과(횟수의 제곱의 합)를 계산합니다.
        long result = 0;
        for (int count : remainderCounts) {
            // 각 횟수(count)를 제곱하여 합에 더합니다.
            // 횟수의 최댓값은 1000 근처이므로 제곱해도 int 범위를 넘지 않지만,
            // 결과 합은 long으로 저장하는 것이 안전합니다.
            result += (long) count * count;
        }

        // 최종 결과를 출력합니다.
        System.out.println(result);
    }
}