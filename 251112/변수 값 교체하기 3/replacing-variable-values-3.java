public class Main {
    public static void main(String[] args) {
        int a =3;
        int b = 5;
        int tmp; // 값이 없음

        tmp=b;
        b=a;
        a=tmp;


        System.out.print(a+"\n"+b);
    }
}