import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // System.out.println("A의 2과목의 점수를 입력해주세요.");
        int aEng = sc.nextInt();
        int aMath = sc.nextInt();

        // System.out.println("B의 2과목의 점수를 입력해주세요.");
        int bEng = sc.nextInt();
        int bMath = sc.nextInt();

        if((aEng > bEng) && (aMath > bMath)){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}