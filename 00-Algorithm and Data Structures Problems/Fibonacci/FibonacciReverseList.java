package Fibonacci;
import java.util.Scanner;

public class FibonacciReverseList {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many Fibonacci numbers do you want to print? ");
        int n = scanner.nextInt();
        printReverseFibonacci(n);

        scanner.close();
    }

    public static void printReverseFibonacci(int list) {
        if (list < 2) {
            System.out.println("There must be at least 2 numbers for the Fibonacci sequence.");
            return;
        }

        int[] fibonacciArray = new int[list];

        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < list; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        System.out.println("Reverse Fibonacci Sequence: ");
        for (int i = list - 1; i >= 0; i--) {
            System.out.print(fibonacciArray[i] + " ");
        }
        System.out.println(); 
    }
}