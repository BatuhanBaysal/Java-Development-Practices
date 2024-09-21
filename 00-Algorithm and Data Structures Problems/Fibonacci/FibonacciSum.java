package Fibonacci;

import java.util.Scanner;

public class FibonacciSum {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many elements of the Fibonacci sequence do you want to add >>> ");
        int n = scanner.nextInt();
        long result = fibonacciSum(n);
        System.out.println("The sum of the first " + n + " Fibonacci numbers: " + result);

        scanner.close();
    }

    public static long fibonacciSum(int n) {
        if (n <= 0) return 0;

        long a = 0, b = 1, sum = a;
        if (n > 1) sum += b;
        
        for (int i = 2; i < n; i++) {
            long next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        
        return sum;
    }
}