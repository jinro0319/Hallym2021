import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score, num;
        double avg;

        System.out.print("학생 수를 입력하세요: ");
        num = scan.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= num) {
            System.out.print(i + " 번째 학생의 성적: ");
            score = scan.nextInt();
            sum = sum + score;
            i++;
        }
        avg = (double) sum / num;
        System.out.print("평균: " + avg);
    }
}