import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = Arrays.copyOf(a, a.length);

        a[0]++;
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.print(b[0] + " " + b[1] + " " + b[2]);
    }
}