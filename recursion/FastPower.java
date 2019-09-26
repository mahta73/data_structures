public class FastPower {
    private static int fastPower(int number, int exponent) {
        if (exponent == 1) 
            return number;
        else if (exponent % 2 == 0)
            return fastPower(number, exponent/2) * fastPower(number, exponent/2);
        else 
            return number * fastPower(number, exponent/2) * fastPower(number, exponent/2);
    }
    public static void main(String[] args) {
        System.out.println(fastPower(2, 7));
        int result = 1;
        for (int i = 0; i < 7; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
}