public class Main {
    public static void main(String[] args) {
        // 1피트 = 30.48; 1마일 =160934
        // 변수 선언
        double a = 9.2;
        double b = 1.3;

        // 출력
        System.out.printf("%.1fft = %.1fcm\n%.1fmi = %.1fcm\n", a, a*30.48, b, b*160934);
    }
}