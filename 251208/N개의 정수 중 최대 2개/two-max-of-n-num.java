import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []arr = new int[100];
        int n = sc.nextInt();
        int max = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j = 0; j<n; j++){
                if(arr[j] < arr[j+1]){
                    max = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = max;
                }
            }
        }
        System.out.pri
        nt(arr[0] + " " + arr[1]); 
    }
}
