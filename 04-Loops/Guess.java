import java.util.Scanner;

public class Guess  {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many trials do you want? (Very Hard: 1-3 try, Hard: 4-6, Medium 7-10 try, Easy 11-20 try) >>> ");
        int trial = scan.nextInt();
        
        while (trial < 1 || trial > 20) {
            System.out.print("Please enter a number between 1 and 20! >>> ");
            trial = scan.nextInt();
        } 

        System.out.print("\nI chose a number between 1 and 100. Try to guess it: ");
        int yourGuess = scan.nextInt();

        int counter = 0;
        int score = 100;
        int guessNumber = guess();

        while (yourGuess != guessNumber) {
            counter++;

            if (counter < trial) {
                System.out.println("Wrong answer. You have " + (trial - counter) + " valid rights left");
                if (yourGuess < guessNumber) {
                    System.out.print("\nIncrease your guess! Again try to guess it >>> ");
                } else {
                    System.out.print("\nDecrease your guess! Again try to guess it >>> ");
                }
                
                yourGuess = scan.nextInt();
            } else {
                System.out.println("\nYou've lost. You've tried " + (trial) + " times. Guess number is " + guessNumber);
                System.exit(0);
            }

            score -= 5;
        } 

        System.out.println("\nYou win! in " + (counter + 1) + " times.");
        System.out.println("Your score is: " + (score - 5));
        scan.close();
    }
        
    public static int guess() {
        double number = Math.random() * 100;
        number += 1;
        return (int)number;
    }
}