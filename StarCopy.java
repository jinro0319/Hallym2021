public class StarCopy {
    public static void main (String[] args) {
        int j, i;

        i = 5;
        while (i > 0) {
            j = 1;  // 별의 갯수
            while (j <= i){ // i값 만큼 별 찍기
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;    // i값을 1씩 감소
        }
    }
}