import java.util.Scanner;

public class Main {

    /**
     * 문자열 A를 오른쪽으로 밀어 B와 같아지게 만드는 최소 횟수를 계산합니다.
     * @param A 시작 문자열
     * @param B 목표 문자열
     * @return 최소 미는 횟수 N. 불가능하면 -1.
     */
    public static int getMinPushCount(String A, String B) {
        // 길이가 다르면 만들 수 없습니다. (문제 조건상 길이는 같음)
        if (A.length() != B.length()) {
            return -1;
        }

        int L = A.length();
        
        // A를 두 번 이어 붙입니다.
        String AA = A + A;
        
        // B가 AA 안에 포함된 첫 번째 위치(인덱스 k)를 찾습니다.
        // 이 인덱스 k는 A를 '왼쪽'으로 k번 밀었을 때 B가 됨을 의미합니다.
        int k = AA.indexOf(B);
        
        // B가 AA 안에 없다면, A를 회전시켜 B를 만들 수 없습니다.
        if (k == -1) {
            return -1;
        }
        
        // A를 '오른쪽'으로 미는 횟수 N은 전체 길이 L에서 k를 뺀 값입니다.
        // 예: L=6, k=3 (왼쪽으로 3번 밀기) -> N = 6-3 = 3 (오른쪽으로 3번 밀기)
        int N = L - k;
        
        return N;
    }

    public static void main(String[] args) {
        // 백준 등 온라인 저지 환경에서는 보통 아래와 같이 입력을 처리합니다.
        Scanner scanner = new Scanner(System.in);
        
        // 입력 문자열 A와 B를 받습니다.
        // 문제 조건에 따라 첫 번째 줄이 A, 두 번째 줄이 B라고 가정합니다.
        // String A = scanner.next(); // 또는 scanner.nextLine();
        // String B = scanner.next(); // 또는 scanner.nextLine();
        
        // 편의를 위해 예시 데이터로 테스트합니다.
        String A1 = "abcdef";
        String B1 = "defabc"; // 예상 결과: 3
        
        String A2 = "abcdef";
        String B2 = "defaco"; // 예상 결과: -1

        System.out.println("--- 예시 1 ---");
        System.out.println("A: " + A1 + ", B: " + B1);
        System.out.println("최소 미는 횟수: " + getMinPushCount(A1, B1));
        
        System.out.println("\n--- 예시 2 ---");
        System.out.println("A: " + A2 + ", B: " + B2);
        System.out.println("최소 미는 횟수: " + getMinPushCount(A2, B2));
        
        scanner.close();
    }
}