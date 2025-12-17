import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str = sc.next();
        int q = sc.nextInt();

        // 문자열의 길이를 구합니다.
        int len = str.length();

        // q개의 질의를 수행합니다.
        for(int i = 0; i < q; i++) {
            // 몇번째 질의인지 확인합니다.
            int qType = sc.nextInt();
            
            if(qType == 1) {
                // a, b를 입력받은 후, a번째 문자와 b번째 문자를 교환하여 출력합니다.
                int a = sc.nextInt();
                int b = sc.nextInt();

                char tmp = str.charAt(a - 1);
                
                // a번째 문자의 자리에 b번째 문자를 넣습니다.
                str = str.substring(0, a - 1) + str.charAt(b - 1) + str.substring(a);
                
                // b번째 문자의 자리에 a번째 문자를 넣습니다.
                str = str.substring(0, b - 1) + tmp + str.substring(b);

                System.out.println(str);
            }
            else {
                // a, b를 입력받은 후, 문자 a를 전부 b로 변경한 뒤 출력합니다.
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                
                // 문자 a를 전부 b로 변경합니다.
                for(int j = 0; j < len; j++)
                    if(str.charAt(j) == a)
                        str = str.substring(0, j) + b + str.substring(j + 1);
                
                System.out.println(str);
            }
        }
    }
}

