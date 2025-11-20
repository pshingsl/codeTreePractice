import java.util.Scanner;   

ublic class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            n/=i;
            if(n<=1)
            break;
        }
        System.out.print(i);
    }
}