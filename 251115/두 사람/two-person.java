import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Aage = sc.nextInt();
        String s = sc.next();

        int Bage = sc.nextInt();
        String m = sc.next();

        // 두 사람 중 한 사람이라도 19세이상이면서 남자면 1출력
        if(Aage >= 19&& s.equals("M") || Bage >= 19 && m.equals("M")){
            System.out.print(1);
        }else{
             System.out.print(0);
        }

        }
}
