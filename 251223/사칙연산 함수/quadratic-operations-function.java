import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char sline=sc.next().charAt(0);
        int c=sc.nextInt();
 
        System.out.println(a+" "+sline+" "+c+" = "+strToNumber(a,c));
       
    }
    public static int strToNumber(int a, int c){
        String[] sline={"*/+-"};
               int number=1;

        for(int i=0;i<=sline.length-1;i++){
            if(sline[i].contains("*"))
                number=a*c;
            else if(sline[i].contains("/"))
                number=a/c;
            else if(sline[i].contains("+"))
                number=a+c;
            else if(sline[i].contains("-"))
                number=a-c;
        }
        return number;
    }
  
}
