public class Main {
    public static void main(String[] args) {
        
        int a=5;
        int b=6;
        int c=7;
        int tmp;

        tmp =c;
        a=tmp;
        b=a;
        c=b;

        System.out.print(a+"\n"+b+"\n"+c);
    }
}