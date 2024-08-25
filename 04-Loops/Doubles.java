public class Doubles {

    public static void main(String[] args) {

        int attemps = 0;
        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);

        while (dice1 != dice2) {
            System.out.println("\n");
            attemps++;
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }

        System.out.println("\nYou rolled doubles in " + (attemps + 1) + " times.");
    }   

    public static int rollDice() {
        double choiceNumber = Math.random() * 6;
        choiceNumber += 1;
        return (int)choiceNumber;
    }
}