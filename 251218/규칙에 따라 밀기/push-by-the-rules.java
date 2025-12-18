import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        int len = A.length();

        String X = sc.next();
       
        char arr[] = X.toCharArray();

        int cnt1 =0;
        int cnt2 =0;  

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]=='L'){
            cnt1++;
            }
            else if (arr[i]=='R'){
            cnt2++;
            }
        }


        if(cnt1>cnt2){ 
            for(int i = 0; i<cnt1-cnt2; i++){
            A = A.substring(1)+ A.substring(0,1);
            }
             System.out.print(A);
        }
        else if(cnt1<cnt2){
            for(int i = 0; i<cnt2-cnt1; i++){
             A = A.substring(len-1,len)+ A.substring(0,len-1);
            }
           
             System.out.print(A);
        }
        else if(cnt1==cnt2){
            System.out.print(A);
        }
    }
}
