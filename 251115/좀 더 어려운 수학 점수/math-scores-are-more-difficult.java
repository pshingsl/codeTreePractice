import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

       
       // 영어점수와 상관없이 수학점수가 높은 쪽 이름 출력
       if(aMath > bMath || (aMath == bMath && aEng > bEng)){
        System.out.print("A");
       }else{
         System.out.print("B");
       }

    

    }
}
