import java.util.Scanner;

public class Survey {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        System.out.println("\nWelcome. Thank you for taking the survey.");

        System.out.print("What is your name? >>> ");
        String name = scanner.nextLine();

        System.out.print("What is your age? >>> ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Where are you from? >>> ");
        String country = scanner.nextLine();

        System.out.println("\nSurvey respondent: " + name + ", " + age + ". From " + country + ". \nIn this survey I will ask you various questions.");

        System.out.print("\nHow many times a week do you buy coffee? >>> ");
        int coffeeAmount = scanner.nextInt();
        counter++;

        scanner.nextLine();
        System.out.print("How much money do you spend on coffee? (Ex. $4,99) >>> ");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.print("\nHow many times a week do you buy fast food? >>> ");
        int foodAmount = scanner.nextInt();
        counter++;

        scanner.nextLine();
        System.out.print("How much money do you spend on fast food? (Ex. $9,99) >>> ");
        double foodPrice = scanner.nextDouble();
        counter++;
        
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");
        System.out.println("Weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food.");

        scanner.nextLine();
        System.out.print("\nSo, What is your job? >>> ");
        String job = scanner.nextLine();

        System.out.print("And, How much (in cents) do you earn annually? >>> ");
        long salary = scanner.nextLong();

        System.out.println("\nYou do " + job + " work and receive " + salary +" annual salary. I hope, you are making a living and are happy.");
        
        scanner.close();
    }
}