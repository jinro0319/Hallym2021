import java.util.*;

public class ScoreArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scores[][] = new int[100][4];
        int size = 0;

        System.out.print("학번을 입력하세요 : ");
        int id = scan.nextInt();

        while (id > -1) {
            scores[size][0] = id;
            System.out.print("중간고사 성적을 입력하세요 : ");
            scores[size][1] = scan.nextInt();
            System.out.print("기말고사 성적을 입력하세요 : ");
            scores[size][2] = scan.nextInt();
            scores[size][3] = scores[size][1] + scores[size][2];
            size++;
            System.out.print("학번을 입력하세요 : ");
            id = scan.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            int max = i;
            for (int j = i + 1; j < size; j++) {
                if (scores[j][3] > scores[max][3])
                    max = j;
            }
            int[] temp = scores[i];
            scores[i] = scores[max];
            scores[max] = temp;
        }
        System.out.print("점수: ");
        for (int i = 0; i < size; i++) {
            System.out.print(scores[i][3] + " ");
        }

        System.out.println("점수를 알고싶은 학번을 입력하세요 : ");
        id = scan.nextInt();

        while (id > -1) {
            int i = 0;
            while (i < size && scores[i][0] != id) {
                i++;
            }
            if (i != size && scores[i][0] == id) {
                System.out.println("찾는 학번은 " + (i + 1) + "등 입니다.");
            } else {
                System.out.println("찾는 학번은 존재하지 않습니다.");
            }
            System.out.print("등수를 알고싶은 학번를 입력하세요 : ");
            id = scan.nextInt();
        }
    }
}
