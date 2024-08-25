import java.util.Scanner;

public class JavaRolls {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("Let's play Roolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules: \n");
        System.out.println(" - If you roll a 6, the game stops. \n");
        System.out.println(" - If you roll a 4, nothing happens. \n");
        System.out.println(" - Otherwise, you get 1 point. \n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        while (true) {
            scan.nextLine();
            int diceRoll = rollDice();
            System.out.print("You rolled a " + diceRoll + ". ");
            
            if (diceRoll == 6) {
                System.out.println("End of game.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");
            } else {
                score++;
                System.out.println("One point. Keep rolling.");    
            }
        }

        if (score >= 3) {
            System.out.println("You are lucky. You win");
        } else {
            System.out.println("Oh no, you lose :(");
        }

        System.out.println("\nYour score is: " + score);
        scan.close();
    }
  
    public static int rollDice() {
        double choiceNumber = Math.random() * 6;
        choiceNumber += 1;
        return (int)choiceNumber;
    }
}