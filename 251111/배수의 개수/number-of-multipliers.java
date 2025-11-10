import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;    
        int cnt1=0;    

        for(int i=1; i<11; i++){
            int c = sc.nextInt();
            if(c%3==0){
                cnt+=1;
            }
            if(c%5==0) {
                cnt1+=1;
            }
        }
        System.out.print(cnt +" "+ cnt1);
    }
}