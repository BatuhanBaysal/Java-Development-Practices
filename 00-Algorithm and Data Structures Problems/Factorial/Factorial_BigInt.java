import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_BigInt {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a big number (or 'q' to quit) >>> ");
            String input = scanner.next(); 
            
            if (input.equalsIgnoreCase("q")) {
                System.out.println("\nProgram ended.");
                break; 
            }

            try {
                int number = Integer.parseInt(input); 

                if (number < 0) {
                    System.out.println("\nError: Factorial of a negative number is not defined.");
                } else {
                    BigInteger factorial = calculateBigFactorial(number);
                    System.out.println(number + " number's factorial: " + factorial);
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a valid integer or 'q' to quit.");
            }
        }

        scanner.close();
    }

    public static BigInteger calculateBigFactorial(int number) {
        if (number == 0 || number == 1) return BigInteger.ONE;
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result; 
    }
}