import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1 2 3 4 5 6 7 8 9 10 -> 2,3 또는 5로 나누어 떨어진다.
        // 2일 경우 -> 2 4 6 8 10
        // 3일 경우 -> 3 6 9
        // 5일 경우 -> 5 10

        int count = 0;
        // n=10이면 1~10까지 반복 
        for(int i=1; i<=n; i++){
            if(i%2==0 || i%3==0 || i%5==0){
                continue;
                count++;
            } 
            }
            System.out.print(count);
            }
        }
