import java.util.Scanner;

public class Star {
    public static void main (String[] args) {
        int n, j, i = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        n = scan.nextInt();
        while (i <= n) {
            j = 1;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}