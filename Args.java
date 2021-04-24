public class Args {
    public static void main(String[] args) {
        int sum = 0;
        for (String sValue : args) {
            int iValue = Integer.parseInt(sValue);
            sum = sum + iValue;
        }
        System.out.print(sum);
    }
}