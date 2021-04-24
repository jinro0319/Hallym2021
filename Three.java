import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, max = 0;

        System.out.print("첫번째 수를 입력하세요 : ");
        a = scan.nextInt();

        System.out.print("두번째 수를 입력하세요 : ");
        b = scan.nextInt();

        System.out.print("세번째 수를 입력하세요 : ");
        c = scan.nextInt();

        if (a > b) {
            if (a > c) {
                max = a;
            }
        }
        if (b > a) {
            if (b > c) {
                max = b;
            }
        }
        if (c > a) {
            if (c > b) {
                max = c;
            }
        }
        System.out.println("가장 큰 수 : " + max);
    }
}