import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i, n, a;

        System.out.print("단을 입력해주세요 : ");
        i = scan.nextInt();

        for (n = 1; n <= 9; n++) {
            a = (i * n);
            System.out.printf("%d * %d = %d\n", i, n, a);
        }
    }
}
