import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score, num;
        double avg;

        System.out.print("학생 수를 입력하세요: ");
        num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " 번째 학생의 성적: ");
            score = scan.nextInt();
            sum = sum + score;
        }
        avg = (double) sum / num;
        System.out.print("평균: " + avg);
    }
}