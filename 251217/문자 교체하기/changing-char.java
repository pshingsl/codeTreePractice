import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 예시:
        // str: tcKVBgGSsqJrWvcJOme
        // str2: dsLPQysTnUVMeBXLR
        
        String str = sc.next();   
        String str2 = sc.next();  
        
        String part1; // str의 첫 두 글자 ("tc")
        String part2; // str2의 두 번째 글자부터 끝까지 ("sLPQysTnUVMeBXLR")

        // 1. str의 첫 두 글자 추출 (인덱스 0부터 2 전까지)
        // 만약 str이 2글자 미만일 경우 IndexOutOfBoundsException 방지 로직 필요
        if (str.length() >= 2) {
            part1 = str.substring(0, 2);
        } else {
            part1 = str; // 2글자 미만이면 전체 사용 (문제 조건에 따라 조정)
        }
        
        // 2. str2의 두 번째 글자부터 끝까지 추출 (인덱스 1부터 끝까지)
        // str2가 1글자 이하일 경우 IndexOutOfBoundsException 방지 로직 필요
        if (str2.length() >= 2) {
            part2 = str2.substring(1); // 인덱스 1부터 끝까지
        } else {
            part2 = ""; // 1글자 이하면 빈 문자열 (문제 조건에 따라 조정)
        }
        
        // 3. 두 부분을 합쳐 출력
        System.out.print(part1 + part2);
        
        sc.close();
    }
}