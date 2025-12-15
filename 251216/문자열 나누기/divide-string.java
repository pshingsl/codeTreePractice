import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. N(숫자 문자열 개수)을 읽습니다.
        int N = sc.nextInt(); 
        
        // 2. N개의 숫자 문자열을 입력받습니다.
        // 배열의 크기를 N에 맞춥니다.
        String[] arr = new String[N];
        
        // N개의 문자열을 읽고, 하나의 긴 문자열로 합치는 작업이 필요합니다.
        StringBuilder sb = new StringBuilder(); // 효율적인 문자열 합치기를 위해 StringBuilder 사용

        for(int i = 0; i < N; i++){
            // String[] arr 대신 StringBuilder에 직접 추가하여 합칩니다.
            sb.append(sc.next()); 
            // ⭐️ 주의: sc.next()는 공백을 기준으로 단어 하나씩만 읽어옵니다. 
            //         입력이 "12 34 567"처럼 분리되어 있어도 문제없이 읽을 수 있습니다.
        }
        
        String combinedString = sb.toString(); 
        // sc.next()를 사용했기 때문에, 사실상 이 combinedString은 이미 공백이 제거된 상태입니다!
        // (sc.next()가 공백을 건너뛰고 단어만 읽기 때문)

        // 3. 5개씩 나누어 출력합니다. (문제에서 '5개씩'이라는 구체적인 조건이 없으므로 N개로 추정하거나 
        //    별도의 조건이 없다면 5개로 가정하고 진행합니다.)
        final int CHUNK_SIZE = 5; // 5개씩 자르는 조건이 명시되어 있다면 해당 값 사용

        for (int i = 0; i < combinedString.length(); i += CHUNK_SIZE) {
            // substring(시작 인덱스, 끝 인덱스)를 사용하여 5개씩 자릅니다.
            int end = Math.min(i + CHUNK_SIZE, combinedString.length());
            String chunk = combinedString.substring(i, end);
            System.out.println(chunk);
        }
        
        sc.close();
    }
}