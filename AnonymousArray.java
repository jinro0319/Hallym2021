public class AnonymousArray {

    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4, 5};
        System.out.println("숫자들의 합 : " + sum(scores));
    }


    public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
    }
}