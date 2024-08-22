import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answer1 = scan.nextLine();
        switch (answer1) {
            case "a": System.out.println("Wrong Answer"); break;
            case "b": System.out.println("Wrong Answer"); break;
            case "c": System.out.println("Correct Answer!!!"); score += 5; break;
            case "d": System.out.println("Wrong Answer"); break;
            default:  System.out.println("Wrong Enter");
        }
        scan.nextLine();
        
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String answer2 = scan.nextLine();
        switch (answer2) {
            case "a": System.out.println("Correct Answer!!!"); score += 5; break;
            case "b": System.out.println("Wrong Answer"); break;
            case "c": System.out.println("Wrong Answer"); break;
            case "d": System.out.println("Wrong Answer"); break;
            default:  System.out.println("Wrong Enter");
        }
        scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String answer3 = scan.nextLine();
        switch (answer3) {
            case "a": System.out.println("Wrong Answer"); break;
            case "b": System.out.println("Wrong Answer"); break;
            case "c": System.out.println("Wrong Answer"); break;
            case "d": System.out.println("Correct Answer!!!"); score += 5; break;
            default:  System.out.println("Wrong Enter");
        }
        scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String answer4 = scan.nextLine();
        switch (answer4) {
            case "a": System.out.println("Correct Answer!!!"); score += 5; break;
            case "b": System.out.println("Correct Answer!!!"); score += 5; break;
            case "c": System.out.println("Wrong Answer"); break;
            case "d": System.out.println("Wrong Answer"); break;
            default:  System.out.println("Wrong Enter");
        }
        scan.nextLine();
        System.out.println("Your final score is: " + score + "/100");

        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5 && score < 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("better luck next time.");    
        }
        scan.close();
    }
}