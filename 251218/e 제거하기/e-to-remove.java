import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문자열 입력
        String str = sc.next();
        
        // 2. 'e'가 가장 처음 등장하는 인덱스 찾기
        // 문제 조건에 따라 'e'는 항상 존재하므로 -1이 반환될 걱정은 없습니다.
        int firstEIndex = str.indexOf('e');
        
        // 3. 해당 인덱스의 'e'를 제외하고 문자열 재구성
        String result = "";
        
        // 3-1. 첫 번째 'e' 이전 부분 (인덱스 0부터 firstEIndex - 1까지)
        // substring(startIndex, endIndex)에서 endIndex는 포함되지 않음
        if (firstEIndex > 0) {
            result += str.substring(0, firstEIndex);
        }
        
        // 3-2. 첫 번째 'e' 이후 부분 (인덱스 firstEIndex + 1부터 끝까지)
        // substring(startIndex)는 startIndex부터 끝까지를 의미
        if (firstEIndex < str.length() - 1) {
            result += str.substring(firstEIndex + 1);
        }
        
        // 4. 결과 출력
        System.out.println(result);
        
        sc.close();
    }
}

// 참고: StringBuilder를 사용하는 더 간단한 방법
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int firstEIndex = str.indexOf('e');
        
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(firstEIndex);
        
        System.out.println(sb.toString());
    }
}
*/