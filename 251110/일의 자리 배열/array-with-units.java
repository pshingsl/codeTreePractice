import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 10개를 출력하기 위헤 10개를 저장하는 배열 생성
        int arr[] = new int[10];

        // 인덱스 0, 1은 값이 a,b고정됨
        arr[0] = a;
        arr[1] = b;

        // 배열에서 반목문을 사용이유 -> 순서대로 순회, 특정 조건을 추가히기위해 사용
        // 예제에 출력을 보면 인덱스 2부터 값이 증가함
        for(int i = 2; i<arr.length; i++)
        // 두 배열 합이 10이상이면 10으로 나눈 나머지 값 구하기
        arr[i] = (arr[i-2] + arr[i-1])%10;

        // 조건 완료 후 저장된 순서대로 출력하기 위해 반복문 사용
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}