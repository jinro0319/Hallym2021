import java.util.Scanner;

public class Mn {
    public static void main (String[] args) {
        int m, n;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        m = scan.nextInt();
        System.out.print("몇번 더할건지 입력하세요 : ");
        n = scan.nextInt();
        while (m <= n) {
            sum = sum + m;
            m++;
        }
        System.out.println(sum);
        System.out.println("반복이 종료되었습니다.");
    }
}