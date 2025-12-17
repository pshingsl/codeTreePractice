import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int eE = 0; // 'ee' 등장 횟수
        int eB = 0; // 'eb' 등장 횟수
        
        String str = sc.next();
        
        // ⭐️ 수정된 핵심 로직 ⭐️
        // 문자열 길이보다 1 작게 반복해야 마지막 두 글자까지 안전하게 검사 가능
        for (int i = 0; i < str.length() - 1; i++) {
            
            // 현재 인덱스 i부터 i+2 전까지 (즉, 두 글자) 부분 문자열 추출
            String sub = str.substring(i, i + 2);
            
            // 1. 'ee' 검사: 추출한 부분 문자열이 "ee"와 같은지 확인
            if (sub.equals("ee")) {
                eE++;
            }
            
            // 2. 'eb' 검사: 추출한 부분 문자열이 "eb"와 같은지 확인
            if (sub.equals("eb")) {
                eB++;
            }
        }
        
        // 결과 출력
        System.out.println(eE + " " + eB);
        
        sc.close();
    }
}