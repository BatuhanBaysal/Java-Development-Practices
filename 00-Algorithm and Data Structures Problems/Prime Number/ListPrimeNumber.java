import java.util.Scanner;

public class ListPrimeNumber {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the starting number: ");
        int start = scanner.nextInt();
        
        System.out.print("\nEnter the number of ends: ");
        int end = scanner.nextInt();
        
        System.out.println("\nPrime numbers between " + start + " and " + end + ".");
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
    
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true; 
    }
}