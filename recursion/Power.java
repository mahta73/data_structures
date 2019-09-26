public class Power {
    private static int power(int number, int exponent) throws Exception {
        if (exponent < 0)
            throw new Exception();
        if (exponent == 0)
            return 1;
        else return number * power(number, exponent-1);
    }
    public static void main(String[] args) {
        try {
            System.out.println(power(8, 3));
        } catch(Exception e) {
            System.out.println("Ops, something went wrong!");
        }
    }
}