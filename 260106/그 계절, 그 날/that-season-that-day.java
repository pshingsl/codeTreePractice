import java.util.Scanner;
public class Main {
    public static boolean isYoonYear(int year) {
        if( (year%4==0 && year%100!=0) || (year%4==0 && year%100==0&&year%400==0) )
            return true;

        return false;
    }

    public static int lastDayNumber(int year, int month) {
        if(month == 2 && isYoonYear(year)) return 29;
        else {
            if(month==2)
                return 28;
            if(month==4 || month==6 || month==9 || month==11)
                return 30;
            else
                return 31;
        }
    }
    public static boolean isExistDate(int year,int month, int day) {
        if(month<=12 && day<=lastDayNumber(year,month))
            return true;

        return false;
    }

    public static String selectWeather(int month) {
        if(month>=3 && month<=5)
            return "Spring";
        else if(month>=6 && month<=8)
            return "Summer";
        else if(month>=9 && month<=11)
            return "Fall";
        else if(month==12 || month==1 || month==2)
            return "Winter";
        else
            return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year  = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        if(isExistDate(year,month,day))
            System.out.println(selectWeather(month));
        else
            System.out.println(-1);
    }
}
