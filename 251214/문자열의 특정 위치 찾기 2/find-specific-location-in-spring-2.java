
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int sum=0;
        String []arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        for (int i=0;i<5;i++){
            for (int j=2;j<4;j++){
                if(arr[i].charAt(j)==n){
                    sum++;
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.print(sum);
    }
}

