import java.util.Scanner;   

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        char ch = sc.next().charAt(0); 
        int area = a*b;
        System.out.println(area);
        
        if(ch == 'C')
            break;
        }
    }
}