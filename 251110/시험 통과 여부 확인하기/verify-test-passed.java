import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score>=80) {
            System.out.println("pass");
        }else{
            // 80점이 이상이 아니면 해당 점수 + x = 80이어야 한다.-> score+?=80 score=57 ?=23점이 필요함 
              System.out.println((80-score) + " more score");
        }
    }
}