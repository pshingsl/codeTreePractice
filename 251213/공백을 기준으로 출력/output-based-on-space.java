import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 첫 번째 줄 전체를 입력 받습니다.
        String str1 = sc.nextLine();
        
        // 2. 두 번째 줄 전체를 입력 받습니다.
        String str2 = sc.nextLine();

        // 3. 두 문자열을 하나의 문자열로 합칩니다.
        String combinedStr = str1 + str2;

        // 4. 합쳐진 문자열의 길이만큼 루프를 돌며 공백을 제외하고 출력합니다.
        for (int i = 0; i < combinedStr.length(); i++) {
            
            // i번째 문자를 가져옵니다.
            char currentChar = combinedStr.charAt(i);

            // 현재 문자가 공백(' ')이 아니라면 출력합니다.
            // char 타입은 작은따옴표를 사용해야 합니다.
            if (currentChar != ' ') {
                System.out.print(currentChar);
            }
            // 만약 공백이라면 아무 작업도 하지 않고 건너뜁니다.
        }
        
        // 루프를 돌면서 문자를 연속적으로 출력했으므로 별도의 마지막 출력은 필요 없습니다.
    }
}