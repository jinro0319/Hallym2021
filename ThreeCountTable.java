public class ThreeCountTable {

    public static void main(String[] args) {
        int a = 0, b = 10;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 != 0) {
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
}