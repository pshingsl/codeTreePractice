public class Main {
    public static void main(String[] args) {
        
        int a=5;
        int b=6;
        int c=7;
        int tmp;

        tmp =c; // 7
        c = b;
        b = a;
        a = tmp;

        System.out.print(a+"\n"+b+"\n"+c); // 7 5 6
    }
}