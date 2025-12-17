import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 두 문자열 입력 받기 (공백으로 구분)
        String s1 = sc.next(); 
        String s2 = sc.next();
        
        // 2. s1의 앞 두 글자 추출 (교체할 부분)
        // substring(0, 2)는 인덱스 0과 1의 문자를 가져옵니다.
        String s1_head = s1.substring(0, 2);
        
        // 3. s2의 세 번째 글자부터 끝까지 추출 (s2의 나머지 부분)
        // substring(2)는 인덱스 2부터 문자열 끝까지 가져옵니다.
        String s2_tail = s2.substring(2);
        
        // 4. 교체: s1의 앞 두 글자 + s2의 나머지 부분을 합쳐 새로운 문자열 생성
        String result = s1_head + s2_tail;
        
        // 5. 결과 출력
        System.out.println(result);
        
        sc.close();
    }
}