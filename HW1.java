import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        int a, b, r;

        Scanner scan = new Scanner(System.in);

        System.out.print("두 개의 정수를 입력하시오(큰 수, 작은 수): ");
        a = scan.nextInt();
        b = scan.nextInt();
        while (b != 0) {
            r = (a % b);
            a = b;
            b = r;
        }
        System.out.print("최대 공약수는 " + a);
    }
}
