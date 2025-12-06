import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []a = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<100;i++){
            a[i] = sc.nextInt();

            if(a[i] == 999 || a[i] == -999)
                break;

            if(a[i] > max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }

        System.out.printf("%d %d",max,min);
    }
}

```이런 식으로 하나의 포문으로 작성해도 상관없나요?
