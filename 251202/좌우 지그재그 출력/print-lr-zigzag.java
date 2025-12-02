import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        boolean flag = true;
        
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                if(flag==false){
                    t+=n;
                }
                for(int j=1; j<=n; j++){
                    System.out.print(t+" ");
                    if(j<n){
                        t++;
                    }
                }
                System.out.println();
            }else{
                t+=n;
                flag = false;
                for(int j=1; j<=n; j++){
                    System.out.print(t+" ");
                    if(j<n){
                        t--;
                    }
                }
                System.out.println();
            }
        }
    }
}
