import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();


        // 숫자로 이루어진 삼각형을 출력합니다.
        for(int i = n; i >= 1; i--) {
            for(int j = n; j >= 1; j--) {
                if(j > i)
                    System.out.print("  ");
                else
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
