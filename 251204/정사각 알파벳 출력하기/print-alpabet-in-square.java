import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 입력 n 받기
        int n = sc.nextInt(); 
        
        // 2. 시작 문자 코드 ('A'의 아스키 코드) 설정
        int startCharCode = 'A'; // Java에서 char는 정수형으로 사용 가능
        
        // 3. 바깥쪽 루프 (행)
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(); // Java에서는 문자열을 효율적으로 추가하기 위해 StringBuilder 사용
            
            // 4. 안쪽 루프 (열)
            for (int j = 0; j < n; j++) {
                
                // 현재 문자의 아스키 코드 계산 (i * n + j)
                int charCode = startCharCode + i * n + j;
                
                // 'Z'의 아스키 코드보다 작거나 같은지 확인
                if (charCode <= 'Z') {
                    // 코드 값을 문자로 변환하여 StringBuilder에 추가
                    sb.append((char) charCode);
                } else {
                    // 'Z'를 넘어가면 현재 행의 루프를 즉시 종료
                    break;
                }
            }
            
            // 5. 한 행의 결과 출력
            System.out.println(sb.toString().trim()); // trim()으로 마지막 공백 제거
        }
        
        sc.close();
    }
}