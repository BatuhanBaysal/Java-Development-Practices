import java.util.HashMap;
import java.util.Scanner;

public class Factorial {

    private static HashMap<Integer, Integer> memo = new HashMap<>();
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nEnter a number to calculate the factorial (press 'q' to exit): ");

            try {
                String input = scanner.nextLine(); 
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("\nProgram terminated.");
                    break;
                }

                int number = Integer.parseInt(input);
                if (number < 0) {
                    throw new IllegalArgumentException("\nNegative numbers or zero are not allowed for factorial.");
                }

                System.out.println("\nfactorialRecursive >>>" +number + "! is equal " + factorialRecursive(number));
                System.out.println("factorialIterative >>>" + number + "! is equal " + factorialIterative(number));
                System.out.println("factorialMemoization >" + number + "! is equal " + factorialMemoization(number));

            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input! Please enter a valid number or press 'q' to exit.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    public static int factorialRecursive(int number) {
        if (number == 0 || number == 1) return 1;
        return number * factorialRecursive(number - 1);
    }

    public static int factorialIterative(int number) {
        if (number == 0 || number == 1) return 1;

        int total = 1;
        for (int i = 2; i <= number; i++) {
            total *= i;
        }

        return total;
    }

    public static int factorialMemoization(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        int result = number * factorialMemoization(number - 1);
        memo.put(number, result);
        return result;
    }
}