import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String input;

        while (true) {
            System.out.print("\nEnter a number to check if it is prime (or type 'q' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("\nProgram terminated.");
                break;
            }

            try {
                int primeNumber = Integer.parseInt(input);
                checkPrime(primeNumber);
            } catch (NumberFormatException e) {
                System.err.println("\nInvalid input! Please enter a valid integer.");
            }
        }

        scanner.close();
    }

    public static void checkPrime(int number) {
        if (number < 0) {
            System.err.println(number + " is negative and cannot be prime.");
            return;
        }

        if (number == 0 || number == 1) {
            System.err.println(number + " is not a prime number because prime numbers are greater than 1.");
            return;
        }

        if (number == 2) {
            System.out.println(number + " is a prime number.");
            return;
        }

        if (number % 2 == 0) {
            System.err.println(number + " is not a prime number (it is divisible by 2).");
            return;
        }

        boolean isPrime = true;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                System.out.println(number + " is divided by " + i + ". Therefore, it is not prime.");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.err.println(number + " is not a prime number.");
        }
    }
}