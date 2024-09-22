package Fibonacci;
import java.util.Scanner;

public class FibonacciBinomExpansion {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n for the binomial expansion: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the number of Fibonacci terms you want to calculate: ");
        int fibCount = scanner.nextInt();
        
        int[] fibonacciArray = new int[fibCount];
        fibonacciArray[0] = 0;
        if (fibCount > 1) {
            fibonacciArray[1] = 1;
        }

        for (int i = 2; i < fibCount; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        
        System.out.print("\nFibonacci Series: ");
        for (int i = 0; i < fibCount; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nBinomial Expansion for (1 + x)^" + n + ":");
        for (int k = 0; k <= n; k++) {
            int binomialCoeff = binomial(n, k);
            System.out.println("C(" + n + "," + k + ") * x^" + k + " = " + binomialCoeff + " * x^" + k);
        }
        
        scanner.close();
    }

    public static int binomial(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}