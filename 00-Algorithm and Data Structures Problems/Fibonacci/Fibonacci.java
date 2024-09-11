package Fibonacci;
import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {

    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number > ");
        int fibonacciNumber = scanner.nextInt();

        System.out.println("\nWhen calculating the Fibonacci number, 3 functions were used: Recursive, Iterative and HashMap.");
        System.out.println("fibonacciRecursive >>> Fibonacci(" + fibonacciNumber + ") = " + fibonacciRecursive(fibonacciNumber));
        System.out.println("fibonacciIterative >>> Fibonacci(" + fibonacciNumber + ") = " + fibonacciIterative(fibonacciNumber)); 
        System.out.println("fibonacciMemoization > Fibonacci(" + fibonacciNumber + ") = " + fibonacciMemoization(fibonacciNumber));
        System.out.println(""); 

        scanner.close();
    }

    public static int fibonacciRecursive(int number) {
        if (number == 0 || number == 1) return number;
        return fibonacciRecursive(number - 2) + fibonacciRecursive(number - 1);
    }

    public static int fibonacciIterative(int number) {
        if (number == 0 || number == 1) return number;

        int pos1 = 0; 
        int pos2 = 1; 
        int result = 0;

        for (int i = 2; i <= number; i++) {
            result = pos1 + pos2;
            pos1 = pos2;
            pos2 = result;
        }

        return result;
    }

    public static int fibonacciMemoization(int number) {
        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        if (number == 0 || number == 1) return number;

        int result = fibonacciMemoization(number - 2) + fibonacciMemoization(number - 1);
        memo.put(number, result);
        return result;
    }
}