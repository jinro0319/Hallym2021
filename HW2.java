public class HW2 {
    public static void main (String[] args) {
        int j, i = 5;

        while (i > 0) {
            j = 1;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}