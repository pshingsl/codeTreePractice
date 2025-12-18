import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String strA = sc.next();
        String strB = sc.next();

        int lenA = strA.length();
        int lenB = strB.length();

        while(true) {
            // a문자열에서 b문자열이 처음 등장하는 위치를 찾습니다.
            int idx = -1;
            
            // Tip1: 우리는 i, i+1, ..., i+lenB-1을 비교할 것입니다.
            // 이 때 마지막 위치는 i+lenB-1 < lenA를 만족해야
            // 하므로 i < lenA - lenB + 1을 구할 수 있습니다.

            int candidates = lenA - lenB + 1;
            for(int i = 0; i < candidates; i++) {
                // i부터 b길이만큼 비교해서 b와 같은지 체크합니다.
                boolean isSame = true;
                for(int j = 0; j < lenB; j++) {
                    if(strA.charAt(i + j) != strB.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }
                if(isSame) {
                    // 문자열을 찾았으므로 i 반환
                    idx = i;
                    break;
                }
            }

            // 찾지 못한 경우
            if(idx == -1)
                break;
            
            // a문자열에서 idx위치에서 b문자열의 길이만큼의 문자를 지웁니다.
            strA = strA.substring(0, idx) + strA.substring(idx + lenB);

            lenA = strA.length();
        }

        System.out.println(strA);
    }
}
