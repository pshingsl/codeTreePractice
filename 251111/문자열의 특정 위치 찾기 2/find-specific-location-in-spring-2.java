import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);

        int total = 0;
        char ch = sc.next().charAt(0);

        for(int i=0; i<5; i++){
            for(int j=2; j<4; j++){
                if(arr[i].charAt(j) == ch){
                    total+=1;
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println(total);
    }
}