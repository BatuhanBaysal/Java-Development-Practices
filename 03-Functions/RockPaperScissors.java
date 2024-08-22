import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String answer = scan.nextLine();

        if (answer.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("\nrock - paper - scissors, shoot!");
            String yourDecision = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(yourDecision, computerChoice);
            printResult(yourDecision, computerChoice, result);
        } else {
            System.out.println("Next Time see you :)");
            System.exit(0);
        }
        scan.close();
    }

    public static String computerChoice() {
        double choiceNumber = Math.random() * 3;
        if ((int)choiceNumber == 0) {
            return "rock";
        } else if ((int)choiceNumber == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String result(String yourDecision, String computerChoice) {
        String result = "";
        if (yourDecision.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourDecision.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourDecision.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourDecision.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourDecision.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (yourDecision.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourDecision.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
    }
 
    public static void printResult(String yourDecision, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + yourDecision);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
    }

}
