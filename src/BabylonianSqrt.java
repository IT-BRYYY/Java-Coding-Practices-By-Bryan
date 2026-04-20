public class BabylonianSqrt {

    // Main method to test the sqrt method
    public static void main(String[] args) {
        System.out.println("Square root of 2:   " + sqrt(2));
        System.out.println("Square root of 4:   " + sqrt(4));
        System.out.println("Square root of 9:   " + sqrt(9));
        System.out.println("Square root of 25:  " + sqrt(25));
        System.out.println("Square root of 100: " + sqrt(100));
        System.out.println("Square root of 2:   " + Math.sqrt(2) + " (Math.sqrt check)");
    }

    public static double sqrt(long n) {
        double lastGuess = 1;         // initial guess
        double nextGuess = 0;         // will hold next approximation

        while (true) {
            nextGuess = (lastGuess + n / lastGuess) / 2;  // Babylonian formula

            if (Math.abs(nextGuess - lastGuess) < 0.0001) {  // close enough?
                break;                // stop the loop
            }

            lastGuess = nextGuess;    // update guess and repeat
        }

        return nextGuess;
    }
}