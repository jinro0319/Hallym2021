public class CalSum {
    public static void main(String[] args){

        int i, sum;
        i = 1;
        sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("합계=" + sum);

    }
}