public class Factorial2 {
    private static int factorial(int number) throws Exception {
        if (number < 0)
            throw new Exception();
        else if (number == 0) 
            return 1;
        else 
            return number * factorial(number-1);
    }
    public static void main(String[] args) {
        try {
            System.out.println(factorial(5));
        } catch(Exception e) {

        }
        
    }
}