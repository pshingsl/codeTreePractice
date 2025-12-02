import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i%2==0 ){
                    System.out.print(cnt+" ");
                    if (j==n-1) {
                        cnt+=2;
                    }else{
                        cnt++;
                    }
                }
                else{ // 이전행의 마지막보다 +2 더 큰 값
                    System.out.print(cnt+" ");
                    if (j==n-1) {
                        cnt++;
                    }else{
                        cnt+=2;
                    }
                }
            }
            System.out.println();
        }
    }
}

