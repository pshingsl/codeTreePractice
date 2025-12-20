import java.util.Scanner;

public class Main {

    /**
     * 문자열 A를 오른쪽으로 밀어 B와 같아지게 만드는 최소 횟수를 계산합니다.
     * @param A 시작 문자열
     * @param B 목표 문자열
     * @return 최소 미는 횟수 N. 불가능하면 -1.
     */
    public static int getMinPushCount(String A, String B) {
        // 1. 길이 확인 (문제 조건에 따라 항상 같지만, 안전하게 확인)
        if (A.length() != B.length()) {
            return -1;
        }

        int L = A.length();
        
        // 2. A를 두 번 이어 붙여 회전된 모든 경우를 포함하는 문자열을 만듭니다.
        String AA = A + A;
        
        // 3. AA 문자열에서 B가 시작하는 인덱스 k를 찾습니다.
        // String.indexOf(B)는 B를 찾지 못하면 -1을 반환합니다.
        int k = AA.indexOf(B);
        
        // 4. B가 AA 안에 없다면, 회전으로 B를 만들 수 없습니다.
        if (k == -1) {
            return -1;
        }
        
        /* * 5. 결과 계산: 
         * k는 A를 '왼쪽'으로 k번 밀어 B를 만들 수 있다는 의미입니다.
         * 문제에서 요구하는 '오른쪽'으로 미는 횟수 N은 전체 길이 L에서 k를 뺀 값입니다.
         *
         * 예: A="abcdef", B="defabc", L=6
         * AA="abcdefabcdef"
         * B는 인덱스 3에서 시작 (k=3)
         * N = L - k = 6 - 3 = 3
         */
        int N = L - k;
        
        return N;
    }

    public static void main(String[] args) {
        // 온라인 저지 환경을 가정하여 Scanner를 통해 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // 첫 번째 줄에서 문자열 A를 읽습니다.
            String A = scanner.next(); 
            // 두 번째 줄에서 문자열 B를 읽습니다.
            String B = scanner.next();
            
            int result = getMinPushCount(A, B);
            
            // 결과를 출력합니다.
            System.out.println(result);
            
        } catch (Exception e) {
            // 입력 오류가 발생할 경우를 대비한 처리
            // System.out.println("-1"); 
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}