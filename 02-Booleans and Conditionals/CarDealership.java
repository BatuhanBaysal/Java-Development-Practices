import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println(" - Welcome to the Car Selling/Renting Dealership.");
        System.out.println(" - Select option 'a' to buy a car.");
        System.out.println(" - Select option 'b' to sell a car.");

        String option = scan.nextLine();
        char optionChar = option.charAt(0);

        switch (optionChar) {
            case 'a': 
                System.out.println("\nYou choose option <" + optionChar + ">. That's car selling."); 
                System.out.print("What is your budget? >>> ");
                double budget = scan.nextDouble();
                scan.nextLine();

                if (budget >= 1000) {
                    System.out.println("\nGreat! A Nissan Altima is available.");
                    System.out.print("Do you have insurance? Write 'yes' or 'no' >>> ");
                    String insurance = scan.nextLine();
                    boolean hasInsurance = insurance.equalsIgnoreCase("yes");

                    System.out.print("Do you have a license? Write 'yes' or 'no' >>> ");
                    String license = scan.nextLine();
                    boolean hasLicense = license.equalsIgnoreCase("yes");
                    
                    System.out.print("What is your credit score? (Min. 500) >>> ");
                    int creditScore = scan.nextInt();
                    scan.nextLine();

                    if (hasInsurance && hasLicense && creditScore >= 500) {
                        System.out.println("\nSold! Pleasure doing business with you.");
                    } else {
                        System.out.println("\nWe're sorry, we can not sell you a car.");
                        System.out.println("You must have insurance and a license. A credit score of at least 500");
                    }
                } else {
                    System.out.println("\nWe're sorry. You are not eligible.");
                    System.out.println("Your budget should be at least 1000");
                }
            break; 

            case 'b': 
                System.out.println("\nYou choose option <" + optionChar + ">. That's car renting."); 
                System.out.print("What is your car valued at? >>> ");
                int value = scan.nextInt();
                scan.nextLine();
                
                System.out.print("What is your selling price? >>> ");
                int price = scan.nextInt();
                scan.nextLine();

                if (value >= price && price <= 10000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we're not interested.");
                    System.out.println("The price at which you sell the car should not exceed the value of the vehicle. And we'll give a maximum of 10,000.");
                }
            break;

            default: System.out.println("\nInvalid option " + optionChar);
        }

        scan.close();
        }
}