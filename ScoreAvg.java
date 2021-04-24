public class ScoreAvg {
    public static void main(String[] args){
        int[] scores = new int[5];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;

        int sum = scores[0] + scores[1] + scores[2];
        double avg = sum / 3;

        System.out.println("합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}