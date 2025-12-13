import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            char ch = sc.next().charAt(0);
            if(arr[i].charAt(i) == ch)
                cnt++;
        }
        System.out.print(cnt);
    }
}