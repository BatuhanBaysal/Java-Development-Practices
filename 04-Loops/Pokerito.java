import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();

        System.out.println("It's like Poker, but a lot simpler\n");
        System.out.println(" - There are two players, you and the computer.");
        System.out.println(" - The dealer will give each player one card.");
        System.out.println(" - Then, the dealer will draw five cards (the river)");
        System.out.println(" - The player with the most river matches wins! ");
        System.out.println(" - If the matches are equal, everyone's a winner!\n");
        System.out.println(" - Ready? Type anything if you are.");
        
        scan.nextLine();
        String yourCard = randomCard();
        String computerCard = randomCard();

        System.out.println("Here's your card: ");
        System.out.println(yourCard);
        System.out.println("\nHere's the computer's card: ");
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 1; i <= 8; i++) {
            scan.nextLine();
            String draw = randomCard(); 
            
            if (yourCard.equals(draw)){
                yourMatches++;
            }
            if (computerCard.equals(draw)) {
                computerMatches++;
            }

            System.out.println("Card " + i + "\n");
            System.out.println(draw);
        }

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println("You win!");
        } else if (computerMatches > yourMatches) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }

         scan.close();
    }

    public static String randomCard() {
        double card = (Math.random() * 13) + 1;
        switch((int)card){
            case 1: return "A";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return "This shouldn't get called.";
        }
    }
}