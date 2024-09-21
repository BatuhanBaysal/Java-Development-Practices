import java.util.Scanner;

public class PrimeFactorization {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a number to check prime factorization (or type 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("\nProgram terminated.");
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (number < 0) {
                    System.err.println("\nNegative numbers are not allowed. Please enter a positive integer.");
                } else if (number == 0) {
                    System.err.println("\nZero does not have prime factors.");
                } else if (number == 1) {
                    System.out.println("1 = 1");
                } else {
                    PrimeFactorization(number);
                }
            } catch (NumberFormatException e) {
                System.err.println("\nInvalid input! Please enter a valid integer.");
            }
        }
        
        scanner.close();
    } 

    public static void PrimeFactorization(int number) {
        System.out.print(number + " = ");

        int base = 0;
        while (number % 2 == 0) {
            base += 1;
            number /= 2;
        }

        if (base > 0) {
            System.out.print("2^" + base);
            if (number > 1) System.out.print(" * ");
        }

        for (long i = 3; (i * i) <= number; i += 2) {
            base = 0;
            while (number % i == 0) {
                base += 1;
                number /= i;
            }

            if (base > 0) {
                System.out.print(i + "^" + base);
                if (number > 1) System.out.print(" * ");
            }
        }

        if (number > 1) {
            System.out.println(number);
        }

        System.out.println(); 
    }
}