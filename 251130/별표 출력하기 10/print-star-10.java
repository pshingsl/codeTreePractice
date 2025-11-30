import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n은 5를 입력한다고 가정합니다.
        int n = sc.nextInt(); 
        int totalRows = n * 2 - 1; // n=5일 때, 총 9줄 출력

        // 1. 행을 제어하는 바깥쪽 루프 (총 9줄)
        for (int i = 1; i <= totalRows; i++) {
            int starCount; // 현재 행에서 출력할 별의 개수
            
            // 2. 별 개수를 계산하는 로직
            if (i <= n) {
                // 1행부터 n행(5행)까지의 별 개수: 1, 5, 2, 4, 3
                // i를 5로 나눈 나머지를 사용하여 패턴을 만듭니다.
                // 1 -> 1, 2 -> 5, 3 -> 2, 4 -> 4, 5 -> 3
                
                int remainder = i % 5;
                if (remainder == 1) starCount = 1;
                else if (remainder == 2) starCount = 5;
                else if (remainder == 3) starCount = 2;
                else if (remainder == 4) starCount = 4;
                else starCount = 3; // remainder == 0 (i=5일 때)
                
            } else {
                // 6행부터 9행까지의 별 개수: 3, 4, 2, 5
                // 대칭성을 이용하거나 별도의 규칙을 적용합니다.
                
                // 여기서는 i를 5로 나눈 나머지를 활용하는 단순화를 유지합니다.
                int remainder = (i - 5) % 5; // 6행부터 1, 2, 3, 4...로 매핑
                if (remainder == 1) starCount = 3; // 6행
                else if (remainder == 2) starCount = 4; // 7행
                else if (remainder == 3) starCount = 2; // 8행
                else starCount = 5; // remainder == 4 (9행)
            }
            
            // 3. 별을 출력하는 안쪽 루프
            for (int j = 0; j < starCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}