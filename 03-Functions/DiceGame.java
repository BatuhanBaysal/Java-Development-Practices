import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("\nTo win, the sum of the 3 numbers you choose must be greater than the sum of the numbers from the 3 dice. The sum of your numbers must be at most 2 numbers higher than the sum of the dice to win. ");
        System.out.print("Enter three numbers between 1-6: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (isLessThan(number1, number2, number3) || isHigherThan(number1, number2, number3)) {
            System.out.println("You entered numbers outside the valid  range");
            System.exit(0);
        }

        int sumOfNumbers = number1 + number2 + number3;
        int sumOfDiceRools = roll1 + roll2 + roll3;
        System.out.println("Your sum: " + sumOfNumbers + " Dice Sum: " + sumOfDiceRools);

        if (userWon(sumOfNumbers, sumOfDiceRools)) {
            System.out.println("\nCongratulations, you won!");
        } else {
            System.out.println("\nOh no, you lose. See you Next Time!");
        }

        scanner.close();
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }

    public static boolean isLessThan(int number1, int number2, int number3) {
        return (number1 < 1 || number2 < 1 || number3 < 1);
    }

    public static boolean isHigherThan(int number1, int number2, int number3) {
        return (number1 > 6 || number2 > 6 || number3 > 6 );
    }

    public static boolean userWon(int sumNumbers, int sumDiceRools) {
        return (sumNumbers > sumDiceRools && (sumNumbers - sumDiceRools) < 3);
    }
}