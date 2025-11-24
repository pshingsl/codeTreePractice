import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int sum = 0;
        double average = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= 250){
                break;
            }else{
                sum += arr[i]; 
                count++;
                average = (double) sum / count; 

            }
        }
        System.out.print(sum+ " ");
        System.out.printf("%.1f",average);
    }
}
