public class Factorial {
    private static int factorial(int number) throws Exception {
        if (number < 0) {
            throw new Exception();
        }
        else if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    private static int factorialLoop(int number) throws Exception {
        int factorialNumber = 1;
        if ( number < 0 ) 
            throw new Exception();
        
        while (number > 0) {
            factorialNumber = factorialNumber * number;
            number--;
        }
        return factorialNumber;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(factorial(5));
        } catch(Exception e) {
            System.out.println("ops!");
        }

        try {
            System.out.println(factorialLoop(5));
        } catch(Exception e) {
            System.out.println("Something went wrong!");
        }
        
    }
}