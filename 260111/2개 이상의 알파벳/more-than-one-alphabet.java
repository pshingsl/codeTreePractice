import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        cal(A);
    }

    public static void cal(String a){
        int cnt=1; //일단 문자열이 1개 있으니 1로 초기화

        for(int i=0; i<a.length()-1; i++){
            if(a.charAt(i) !=a.charAt(i+1)){  //첫번째 문자열과 그 다음 문자열 비교
                cnt++; //일치하지 않으면 서로다른 문자열
            }
        }

        if(cnt>=2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}
