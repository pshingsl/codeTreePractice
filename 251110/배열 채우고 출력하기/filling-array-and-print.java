import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 문자 10개니까 문자  타입인 char로 선언
        char ch[] = new char[10];

        // 입력 받은 문자들을 입력 받은 순서의 역순으로 출력
        for(int i=0; i<ch.length; i++){
            ch[i] = sc.next().charAt(0);
        }

          for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    }
}