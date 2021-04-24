import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] scores = new int[100];
        int score, total, temp, size;
        double avg;
        total = 0;
        size = 0;

        System.out.print("점수를 입력하세요(-1를 입력하면 입력 종료): ");
        score = scan.nextInt();

        while (score > -1) {
            scores[size] = score;
            size++;
            System.out.print("점수를 입력하세요(-1를 입력하면 입력 종료): ");
            score = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            total = total + scores[i];
        }

        for (int i = 0; i < size - 1; i++) {
            int max = i;
            for (int j = i + 1; j < size; j++) {
                if (scores[j] > scores[max])
                    max = j;
            }
            temp = scores[i];
            scores[i] = scores[max];
            scores[max] = temp;
        }
        avg = (double)total / size;

        System.out.print("점수: ");
        for (int i = 0; i < size; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println("\n평균: " + avg);
        System.out.println("최고점수: " + scores[0] + " 최저점수: " + scores[size - 1]);

        System.out.print("등수를 알고싶은 점수를 입력하세요(-1을 입력하면 입력 종료): ");
        score = scan.nextInt();


        while (score > -1) {
            int i = 0;
            while (i < size && scores[i] > score) {
                i++;
            }
            if (i != size && scores[i] == score) {
                System.out.println("찾는 점수는 " + (i + 1) + "등 입니다.");
            } else {
                System.out.println("찾는 점수는 존재하지 않습니다.");
            }
            System.out.print("등수를 알고싶은 점수를 입력하세요(-1을 입력하면 입력 종료): ");
            score = scan.nextInt();
        }
    }
}