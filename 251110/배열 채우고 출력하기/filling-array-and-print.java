import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 문자 10개를 저장할 수 있는 배열 생성
        char[] arr = new char[10];

        
        // 배열을 순회한다. -> 반복문 사용 -> 사용 이유? -> 각 요소에 순서대로 접근해 특정 연산 수행 및 조건추가
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next().charAt(0); // arr[0] = L, arr[1] = E, ...
           // System.out.print(arr[i]+" "); // L E B R O S C O D E
        }

        // 역순 출력 -는 해당 배열 또는 문자열 맨 뒤에서 부터 출력
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}