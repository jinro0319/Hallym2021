import java.util.*;

public class loopexample2 {
    public static void main(String[] args) {
        int n;
        int i = 1;
        System.out.print("원하는 구구단 단을 입력하시오 : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (i <= 9) {
            System.out.println(n + "*" + i + "=" + n * i);
            i++;
        }
    }
}
