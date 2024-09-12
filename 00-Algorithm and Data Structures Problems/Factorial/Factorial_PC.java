import java.util.Scanner;

public class Factorial_PC {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nFactorial calculation with Permutation >>> P(n, r) = n! / (n - r)!");
        System.out.println("Factorial calculation by Combination >>> C(n, r) = n! / r!(n - r)!");

        System.out.print("\nEnter a number for n >>> ");
        int n = scanner.nextInt();
        System.out.print("Enter a number for r >>> ");
        int r = scanner.nextInt();

        System.out.println("\nFactorial of " + n + " is: " + factorial(n));
        System.out.println("Permutation P(" + n + ", " + r + ") is: " + permutation(n, r));
        System.out.println("Combination C(" + n + ", " + r + ") is: " + combination(n, r));

        scanner.close();
    }   

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    
    public static long permutation(int n, int r) {
        if (r > n) {
            throw new IllegalArgumentException("r cannot be greater than n");
        }
        return factorial(n) / factorial(n - r);
    }
    
    public static long combination(int n, int r) {
        if (r > n) {
            throw new IllegalArgumentException("r cannot be greater than n");
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}