import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int randomCard1 = randomCard();
        int randomCard2 = randomCard();

        System.out.println("\n You get a " + cardString(randomCard1) + " and " + cardString(randomCard2));
        int handValue = Math.min(randomCard1, 10) + Math.min(randomCard2, 10);
        System.out.println("\nYour total is: " + handValue);

        int dealerRandomCard1 = randomCard();
        int dealerRandomCard2 = randomCard();

        System.out.println("\n The dealer shows " + cardString(dealerRandomCard1) + " and has a card facing down " + faceDown());
        int dealerHandValue = Math.min(dealerRandomCard1, 10) + Math.min(dealerRandomCard2, 10);
        System.out.println("\nThe dealer's total is hidden");

       while(true) {
            String option = hitOrStay();

            if (option.equals("stay")) {
                break;
            }

            int newCard = randomCard();
            handValue += Math.min(newCard, 10);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("your total is " + handValue);

            if (handValue > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
       }

        System.out.println("\nDealer's turn");
        System.out.println("\n The dealer's cards are \n" + cardString(dealerRandomCard1) + " and a " + cardString(dealerRandomCard2));
        System.out.println("Dealer's total is " + dealerHandValue);

        while (dealerHandValue < 17) {
            int newCard = randomCard();
            dealerHandValue += Math.min(newCard, 10);
            System.out.println("\nDealer gets a " + cardString(newCard));
            System.out.println("Dealer's total is " + dealerHandValue);
        }
        
        if (dealerHandValue > 21) {
            System.out.println("Bust! Dealer loses.");
            System.exit(0);
        }

        if (handValue > dealerHandValue) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }

         scan.close();
    }

    public static int randomCard() {
        double card = Math.random() * 13;
        card += 1;
        return (int)card;
    }

    public static String cardString(int cardNumber) {
        switch(cardNumber) {
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
            default: return "not possible";
        }
    }

    public static String faceDown() {
        return "J";
    }
    
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();

        while (!(response.equals("hit") || response.equals("stay"))) {
            System.out.println("Please write hit or stay");
            response = scan.nextLine();
        }
        return response;
    }
}