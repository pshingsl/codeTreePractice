import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        // 상단
        for (int i = 0; i < n; i++){
            for (int j=n-1-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 하단
        for (int i = 1; i < n; i++){
            for (int k=0; k<i; k++){
                System.out.print(" ");
            }
            for (int k=n-i; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
