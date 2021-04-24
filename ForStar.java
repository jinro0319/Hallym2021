public class ForStar {
    public static void main (String[] args) {
        int j, i;


        for (i = 5; i >= 0; i--) {
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}