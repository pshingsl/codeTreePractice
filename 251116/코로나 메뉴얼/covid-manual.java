import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char a1 = sc.next().charAt(0);
        int a = sc.nextInt();

        char b1 = sc.next().charAt(0);
        int b = sc.nextInt();
        
        char c1 = sc.next().charAt(0);
        int c = sc.nextInt();
        

        if(a>=37 && a1=='Y'){
            if((b>=37 && b1=='Y' )|| (c>=37 && c1=='Y'))
                System.out.print('E');
            else
               System.out.print('N');  
        }else{
            if((b>=37 && b1=='Y') && (c>=37 && c1 == 'Y'))
                 System.out.println("E");
            else
                System.out.println("N");
        }
    }
}